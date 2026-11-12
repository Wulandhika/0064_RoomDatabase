package com.example.mytesting9.repositori

import android.content.Context
import com.example.mytesting9.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa =
        OfflineRepositoriSiswa(siswaDao = DatabaseSiswa.DatabaseSiswa.getDatabase(context).siswaDao())
}