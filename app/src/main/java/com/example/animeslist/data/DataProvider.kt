package com.example.animeslist.data

import com.example.animeslist.R

object DataProvider {
    val Listanimes = listOf(
        Anime(
            id = 1,
            title = "One Piece",
            date = "1999",
            description = "Monkey D. Luffy et son équipage de pirates naviguent à la recherche du légendaire trésor \"One Piece\", avec pour but de faire de Luffy le Roi des Pirates.",
            imageId = R.drawable.p1
        ),
        Anime(
            id = 2,
            title = "Naruto",
            date = "2002",
            description = "Naruto Uzumaki, un jeune ninja ambitieux, souhaite devenir Hokage, le ninja le plus puissant de son village, tout en apprenant à maîtriser le démon renard scellé en lui.",
            imageId = R.drawable.p2
        ),
        Anime(
            id = 3,
            title = "Death Note",
            date = "2006",
            description = "Light Yagami, un étudiant, découvre un carnet mystérieux appelé \"Death Note\" qui lui permet de tuer toute personne dont il connaît le nom et le visage. Il s'engage alors dans une lutte intellectuelle avec le détective L pour échapper à la capture.",
            imageId = R.drawable.p3
        ),
        Anime(
            id = 4,
            title = "Attack on Titan (Shingeki no Kyojin)",
            date = "2013",
            description = "Dans un monde où l'humanité est menacée par des titans géants, Eren Yeager rejoint le corps de défense pour combattre ces créatures et découvrir la vérité derrière leur existence.",
            imageId = R.drawable.p4
        ),
        Anime(
            id = 5,
            title = "Demon Slayer (Kimetsu no Yaiba)",
            date = "2019",
            description = "Tanjiro Kamado devient un tueur de démons pour venger sa famille et trouver un remède à sa sœur, Nezuko, transformée en démon après une attaque sanglante.",
            imageId = R.drawable.p5
        ),
        Anime(
            id = 6,
            title = "Hunter x Hunter",
            date = "2011 (reboot)",
            description = "Gon Freecss, un jeune garçon, décide de devenir Hunter, un aventurier professionnel, pour retrouver son père. Il se lance dans un voyage rempli de défis, de dangers et de rencontres uniques.",
            imageId = R.drawable.p6
        ),
        Anime(
            id = 7,
            title = "Jujutsu Kaisen",
            date = "2020",
            description = "Yuji Itadori, un lycéen, se retrouve impliqué dans le monde des malédictions après avoir avalé un doigt maudit. Il rejoint une école d'exorcistes pour maîtriser ses nouvelles capacités et combattre des esprits malveillants.",
            imageId = R.drawable.p7
        )
    )
}