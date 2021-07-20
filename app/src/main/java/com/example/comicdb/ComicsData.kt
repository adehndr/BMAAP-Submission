package com.example.comicdb

object ComicsData {

    private val comicPhotos = intArrayOf(
        R.drawable.slime,
        R.drawable.aot,
        R.drawable.yurucamp,
        R.drawable.horimiya,
        R.drawable.drstone,
        R.drawable.gotoubun,
        R.drawable.rezero,
        R.drawable.promised,
        R.drawable.nanatsu,
        R.drawable.hataraku

    )
    private val comicTittles = arrayOf(
        "That Time I Got Reincarnated as a Slime",
        "Attack on Titan",
        "Yuru Camp",
        "Horimiya",
        "Dr. Stone",
        "The Five Wedded Brides",
        "ReZero Daisanshou: Truth of Zero",
        "The Promised Neverland",
        "The Seven Deadly Sins",
        "Cells at Work!"
    )

    private val comicTags = arrayOf(
        "Isekai",
        "Action",
        "Slice of Life",
        "Romance",
        "Adventure",
        "Romance",
        "Drama",
        "Action",
        "Action",
        "Comedy"
    )

    private val comicDetails = arrayOf(
        "The ordinary Mikami Satoru found himself dying after being stabbed by a slasher. It should have been the end of his meager 37 years, but he found himself deaf and blind after hearing a mysterious voice. He had been reincarnated into a slime!",
        "Several hundred years ago, humans were nearly exterminated by Titans. Titans are typically several stories tall, seem to have no intelligence, devour human beings and, worst of all, seem to do it for the pleasure rather than as a food source. A small percentage of humanity survived by walling themselves in a city protected by extremely high walls, even taller than the biggest of Titans.",
        "Rin, a girl camping by herself at the base of Mt. Fuji. Nadeshiko, a girl who came to see Mt. Fuji on her bicycle. The scenery the two witness over a supper of cup ramen marks the start of a new friendship and many adventures to come, camping in the great outdoors!",
        "Kyoko Hori is your average teenage girl... who has a side she wants no one else to ever discover. Then there's her classmate Izumi Miyamura, your average glasses-wearing boy — who's also a totally different person outside of school. When the two unexpectedly meet, they discover each other's secrets, and a friendship is born.",
        "Imagine waking to a world where every last human has been mysteriously turned to stone One fateful day, all of humanity was petrified by a blinding flash of light. After several millennia, high schooler Taiju awakens and finds himself lost in a world of statues. However, he's not alone! His science-loving friend Senku's been up and running for a few months and he's got a grand plan in mind—to kickstart civilization with the power of science!",
        "Uesugi Fuutarou is a poor, antisocial ace student who one day meets the rich transfer student Nakano Itsuki. They argue but when Uesugi realizes he is to be her tutor, he tries to get on better terms. While trying to do so he meets four other girls.",
        "Suddenly a high-school student Subaru Natsuki has been summoned to another world on the way back from the convenience store. With the biggest crisis of his life being summoned to another world and no sign of the one who summoned him things become worse when he is attacked. But when he is saved by a mysterious silver-haired girl with a fairy cat, Subaru co-operates with the girl to return the favor. When they finally manage to get a clue Subaru and the girl are attacked and killed by someone. Subaru then awakens in the place he was summoned and notices the ability he gained \"Returns by Death\" a helpless boy that only has the ability to rewind time by dying. And beyond the despair can he save the girl from the fate of death!",
        "At Grace Field House, life couldn't be better for the orphans! Though they have no parents, together with the other kids and a kind \"Mama\" who cares for them, they form one big, happy family. No child is ever overlooked, especially since they are all adopted by the age of 12. Their daily lives involve rigorous tests, but afterwards, they are allowed to play outside.\n There is only one rule they must obey: do not leave the orphanage. But one day, two top-scoring orphans, Emma and Norman, venture past the gate and unearth the horrifying reality behind their entire existence: they are all livestock, and their orphanage is a farm to cultivate food for a mysterious race of demons. With only a few months left to pull off an escape plan, the children must somehow change their predetermined fate.",
        "The \"Seven Deadly Sins,\" a group of evil knights who conspired to overthrow the kingdom of Britannia, were said to have been eradicated by the Holy Knights, although some claim that they still live. Ten years later, the Holy Knights have staged a Coup d'état and captured the king, becoming the new, tyrannical rulers of the kingdom. Elizabeth, the king's third daughter, sets out on a journey to find the \"Seven Deadly Sins,\" and to enlist their help in taking back the kingdom.",
        "Strep throat! Hay fever! Influenza! The world is a dangerous place for a red blood cell just trying to get her deliveries finished. Fortunately, she’s not alone … She’s got a whole human body’s worth of cells ready to help out! The mysterious white blood cell, the buff and brash killer T cell, the nerdy neuron, even the cute little platelets—everyone’s got to come together if they want to keep you healthy!"
    )

    val listdata : ArrayList<Comic>
    get()
    {
        val list = arrayListOf<Comic>()
        for (position in comicTittles.indices)
        {
            val comic = Comic()
            comic.photo = comicPhotos[position]
            comic.tittle = comicTittles[position]
            comic.tag = comicTags[position]
            comic.detail = comicDetails[position]
            list.add(comic)
        }

        return list
    }
}