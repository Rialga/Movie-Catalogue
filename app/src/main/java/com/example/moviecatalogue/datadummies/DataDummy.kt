package com.example.moviecatalogue.datadummies

import com.example.moviecatalogue.models.MovieListModel

object DataDummy {

    fun generateDummyMovies(): List<MovieListModel.Results> {

        val movies = ArrayList<MovieListModel.Results>()

//        movies.add(
//            MovieListModel(
//                "M0-11",
//                "Avengers: Infinity War",
//                "Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet -- the evil Thanos. On a mission to collect all six Infinity Stones, Thanos plans to use the artifacts to inflict his twisted will on reality. The fate of the planet and existence itself has never been more uncertain as everything the Avengers have fought for has led up to this moment.",
//                "https://www.themoviedb.org/t/p/original/1uoU4qPZEcOus0rQf8Tz4JCn3cX.jpg",
//                "8.4",
//                "Action/Adventure",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-12",
//                "The Amazing Spider-Man 2",
//                "Confident in his powers as Spider-Man, Peter Parker (Andrew Garfield) embraces his new role as a hero and spends time with Gwen Stacy (Emma Stone) in between protecting New York from criminals. However, his greatest battle yet is about to begin. With the emergence of Electro (Jamie Foxx), Peter must confront an enemy far more powerful than he is. And when his old friend Harry Osborn (Dane DeHaan) returns, Peter comes to realize that all his enemies have one thing in common: Oscorp.",
//                "https://www.themoviedb.org/t/p/original/kV61FAIsRWZP6JhgWFOKug9RbBx.jpg",
//                "6.6",
//                "Action/Adventure",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-13",
//                "The Shawshank Redemption",
//                "Andy Dufresne (Tim Robbins) is sentenced to two consecutive life terms in prison for the murders of his wife and her lover and is sentenced to a tough prison. However, only Andy knows he didn't commit the crimes. While there, he forms a friendship with Red (Morgan Freeman), experiences brutality of prison life, adapts, helps the warden, etc., all in 19 years.",
//                "https://www.themoviedb.org/t/p/original/hBcY0fE9pfXzvVaY4GKarweriG2.jpg",
//                "9.3",
//                "Drama/Crime",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-14",
//                "Interstellar",
//                "In Earth's future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable. Professor Brand (Michael Caine), a brilliant NASA physicist, is working on plans to save mankind by transporting Earth's population to a new home via a wormhole. But first, Brand must send former NASA pilot Cooper (Matthew McConaughey) and a team of researchers through the wormhole and across the galaxy to find out which of three planets could be mankind's new home.",
//                "https://www.themoviedb.org/t/p/original/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
//                "8.6",
//                "Sci-fi/Adventure",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-15",
//                "Whiplash",
//                "Andrew Neiman (Miles Teller) is an ambitious young jazz drummer, in pursuit of rising to the top of his elite music conservatory. Terence Fletcher (J.K. Simmons), an instructor known for his terrifying teaching methods, discovers Andrew and transfers the aspiring drummer into the top jazz ensemble, forever changing the young man's life. But Andrew's passion to achieve perfection quickly spirals into obsession, as his ruthless teacher pushes him to the brink of his ability and his sanity.",
//                "https://www.themoviedb.org/t/p/original/E1fpfU9cMCgFYL3QPvJr3vt20X.jpg",
//                "8.5",
//                "Drama/Musical",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-16",
//                "Shutter Island",
//                "Teddy Daniels and Chuck Aule, two US marshals, are sent to an asylum on a remote island in order to investigate the disappearance of a patient, where Teddy uncovers a shocking truth about the place.",
//                "https://www.themoviedb.org/t/p/original/kve20tXwUZpu4GUX8l6X7Z4jmL6.jpg",
//                "8.2",
//                "Thriller/Mystery",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-17",
//                "V for Vendetta",
//                "V for Vendetta takes the background of Britain in a future era when it is under the leadership of a totalitarian regime. This started after the third world war that devastated various countries. Chaos spread everywhere, hunger, disease and also the death rate was so high. This eventually became the justification for an ambitious politician to gain power by applying a fascist pattern of power. Everything is controlled by the state, there is no civil liberties, even including the opinion and being different. Even in it, embracing a religion other than one that is 'sanctioned' by the government, is considered a crime. In one section, it is narrated how a person can be arrested just for possessing the Qur'an. Films, literary books and even works of art were banned.",
//                "https://www.themoviedb.org/t/p/original/kxekpqZUpO5W65QT12goucFvyx9.jpg",
//                "8.1",
//                "Action/Thriller",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-18",
//                "Free Guy",
//                "When a bank teller discovers he's actually a background player in an open-world video game, he decides to become the hero of his own story -- one that he can rewrite himself. In a world where there's no limits, he's determined to save the day his way before it's too late, and maybe find a little romance with the coder who conceived him.",
//                "https://www.themoviedb.org/t/p/original/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg",
//                "7.2",
//                "Action/Comedy",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-19",
//                "Tazza: The Hidden Card",
//                "After Ham Dae-gil enters the gambling world, he is set up as the fall guy in a crooked deal. To get revenge, he enters a final game which could be fatal to the loser.",
//                "https://www.themoviedb.org/t/p/original/lx5HsMSE8A6bPy3Vuaj5O0rGk2S.jpg",
//                "6.8",
//                "Drama/Crime",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-20",
//                "The Last: Naruto the Movie",
//                "Two years after the Fourth Shinobi World War, Naruto must stop Toneri Otsutsuki, a descendant of Hamura Otsutsuki, after Toneri causes the moon to descend toward Earth.",
//                "https://www.themoviedb.org/t/p/original/bAQ8O5Uw6FedtlCbJTutenzPVKd.jpg",
//                "7.7",
//                "Action/Addventure",
//                "movie"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-1",
//                "Fleabag",
//                "Fleabag is a passionate young woman who often dates men without seriousness. Not only that, he is known as an unstable, pessimistic, and sarcastic person. However, which escapes the attention of many, he uses sex and humor as a shield to cover up his chaotic life.",
//                "https://www.themoviedb.org/t/p/original/27vEYsRKa3eAniwmoccOoluEXQ1.jpg",
//                "8.7",
//                "Comedy-Drama",
//                "tvshow"
//            )
//        )
//        movies.add(
//            MovieListModel(
//                "M-2",
//                "Money Heist",
//                "Money Heist tells the story of 8 thieves who take hostage and lock themselves in the Spanish Money Printing Agency, while the mastermind of the crime will outsmart the police so he can carry out his plan.",
//                "https://www.themoviedb.org/t/p/original/fYkyF19UJdpSCMRwcQyoryBlnU3.jpg",
//                "8.2",
//                "Thriller",
//                "tvshow"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-3",
//                "Black Mirror",
//                "Black Mirror is a British television anthology series by Charlie Brooker that tells the story of speculative fiction with dark and satirical themes about modern society, especially the detrimental effects of advanced technology. This series is produced by Zeppotron for Endemol.",
//                "https://www.themoviedb.org/t/p/original/dw7jYk7EdrkrHozG7F1Yg2eFJTm.jpg",
//                "8.8",
//                "Sci-fi",
//                "tvshow"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-4",
//                "Peaky Blinders",
//                "The story is set in Birmingham in 1919 after the end of World War I. Thomas Shelby or Tommy (Cillian Murphy) is the leader of the Peaky Blinder gang with a cunning character from Ireland. Their group is known to be very vicious because they carry out many criminal acts such as robbery, illegal gambling to illegal business.",
//                "https://www.themoviedb.org/t/p/original/arlFd2cGgP9kvEnL9FwXlcTm28D.jpg",
//                "8.8",
//                "Drama",
//                "tvshow"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-5",
//                "Stranger Things",
//                "Stranger Things is an American science fiction horror drama television series created by the Duffer Brothers and streaming on Netflix. The brothers serve as showrunners and are executive producers along with Shawn Levy and Dan Cohen. The series premiered on Netflix on July 15, 2016. Set in the 1980s in the fictional town of Hawkins, Indiana, the first season focuses on the investigation into the disappearance of a young boy (Will Byers) amid supernatural events occurring around the town, including the appearance of a girl with psychokinetic abilities (Eleven). The second season focuses on Will's side effects from being in the Upside Down with its entities crawling into the real world. The third season focuses Eleven and Mike's relationship as the kids continue their battle against the Upside Down entities. The series stars an ensemble cast including Winona Ryder, David Harbour, Finn Wolfhard, Millie Bobby Brown, Gaten Matarazzo, Caleb McLaughlin, Noah Schnapp, Sadie Sink, Natalia Dyer, Charlie Heaton, Joe Keery, Cara Buono and Dacre Montgomery.",
//                "https://www.themoviedb.org/t/p/original/lXS60geme1LlEob5Wgvj3KilClA.jpg",
//                "8.7",
//                "Sci-fi",
//                "tvshow"
//            )
//        )
//
//
//        movies.add(
//            MovieListModel(
//                "M-6",
//                "DareDevil",
//                "Attorney Matt Murdock (Ben Affleck) is blind, but his other four senses function with superhuman sharpness. By day, Murdock represents the downtrodden. At night, he is Daredevil, a masked vigilante, a relentless avenger of justice. When Wilson Fisk (Michael Clarke Duncan) hires Bullseye (Colin Farrell) to kill Daredevil, Murdock must rely on his own senses and search out the conspirators against justice -- which may include his own girlfriend, Elektra (Jennifer Garner).",
//                "https://www.themoviedb.org/t/p/original/2qfaHJaodEbMmj9GXMvj84mbpy3.jpg",
//                "8.6",
//                "Action Fiction",
//                "tvshow"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-7",
//                "The Queen's Gambit",
//                "The Queen's Gambit follows the life of an orphaned chess genius, Beth Harmon, on her quest to become the greatest chess player in the world. On the other hand he also struggles with emotional problems and drug and alcohol dependence.",
//                "https://www.themoviedb.org/t/p/original/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
//                "8.6",
//                "Historical Film",
//                "tvshow"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-8",
//                "Start-up",
//                "Start Up is a romantic drama that tells the life of a young man who is trying to start a startup business. Seo Dal Mi is a girl who aspires to be like Steve Jobs. She works part time while helping her grandmother sell.",
//                "https://www.themoviedb.org/t/p/original/hxJQ3A2wtreuWDnVBbzzXI3YlOE.jpg",
//                "8.1",
//                "Drama",
//                "tvshow"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-9",
//                "Upload",
//                "Upload tells the story of the life of Nathan Brown (Robbie Amell). One time he got very badly injured after a car accident. Because his girlfriend, Ingrid, is from a very rich person, Nathan was finally 'uploaded' so that Ingrid could stay with Nathan despite being in a different world.",
//                "https://www.themoviedb.org/t/p/original/6SIDIB59JYsQ8EfUgM0IaFfwXtS.jpg",
//                "8",
//                "Sci-fi",
//                "tvshow"
//            )
//        )
//
//        movies.add(
//            MovieListModel(
//                "M-10",
//                "Game Of Thrones",
//                "This film tells the story of 9 noble families who fight for control of the land of Westeros. However, in the midst of their conflict, a secret enemy that has not been heard from for thousands of years is now active again.",
//                "https://www.themoviedb.org/t/p/original/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
//                "9.2",
//                "Drama",
//                "tvshow"
//            )
//        )




        return movies
    }


}