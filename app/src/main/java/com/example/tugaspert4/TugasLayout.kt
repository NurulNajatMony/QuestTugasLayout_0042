package com.example.tugaspert4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AktivitasKeempat(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_black)
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_black)
        )

        Spacer(modifier = Modifier.height(16.dp))

        StudentCard(
            imageRes = R.drawable.logo_umy,
            nameRes = R.string.nama,
            nimRes = null,
            addressRes = R.string.alamat,
            backgroundColorRes = R.color.card_bg_gray,
            addressColorRes = R.color.text_yellow,
            nameFontFamily = FontFamily.Cursive
        )

        StudentCard(
            imageRes = R.drawable.logo_umy,
            nameRes = R.string.nama_1,
            nimRes = R.string.nim_1,
            addressRes = R.string.alamat_1,
            backgroundColorRes = R.color.card_bg_purple,
            addressColorRes = R.color.text_yellow
        )
    }
}
