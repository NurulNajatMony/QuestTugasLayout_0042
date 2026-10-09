package com.example.tugaspert4

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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

        StudentCard(
            imageRes = R.drawable.logo_umy,
            nameRes = R.string.nama_2,
            nimRes = R.string.nim_2,
            addressRes = R.string.alamat_2,
            backgroundColorRes = R.color.card_bg_blue,
            addressColorRes = R.color.text_white
        )

        StudentCard(
            imageRes = R.drawable.logo_umy,
            nameRes = R.string.nama_3,
            nimRes = R.string.nim_3,
            addressRes = R.string.alamat_3,
            backgroundColorRes = R.color.card_bg_green,
            addressColorRes = R.color.text_white
        )

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = stringResource(id = R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 30.dp),
                color = colorResource(id = R.color.text_black)
            )
        }
    }
}


@Composable
fun StudentCard(
    imageRes: Int,
    nameRes: Int,
    nimRes: Int?,
    addressRes: Int,
    backgroundColorRes: Int,
    addressColorRes: Int,
    nameFontFamily: FontFamily = FontFamily.Default
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = backgroundColorRes)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

        }
    }
}