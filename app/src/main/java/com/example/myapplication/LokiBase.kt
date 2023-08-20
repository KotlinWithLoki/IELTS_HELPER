package com.example.myapplication

object Constants {

    fun getQuestions():ArrayList<ItemsViewModel>{

        val data=ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel("Work and studies", "1"))
        data.add(ItemsViewModel("Hometown", "2"))
        data.add(ItemsViewModel("Home decoration", "3"))
        data.add(ItemsViewModel("Chocolate", "4"))
        data.add(ItemsViewModel("Staying up late", "5"))
        data.add(ItemsViewModel("Outer space and stars", "6"))
        data.add(ItemsViewModel("Jewelry", "7"))
        data.add(ItemsViewModel("Music", "8"))
        data.add(ItemsViewModel("Small businesses", "9"))
        data.add(ItemsViewModel("Weekends", "10"))
        data.add(ItemsViewModel("T-shirts", "11"))
        data.add(ItemsViewModel("Happiness", "12"))
        data.add(ItemsViewModel("Art", "13"))
        data.add(ItemsViewModel("Keys", "14"))
        data.add(ItemsViewModel("Libraries", "15"))
        data.add(ItemsViewModel("Schools", "16"))
        data.add(ItemsViewModel("Bags", "17"))
        data.add(ItemsViewModel("Wild animals", "18"))
        data.add(ItemsViewModel("Rain", "19"))
        data.add(ItemsViewModel("Teachers", "20"))
        data.add(ItemsViewModel("Concentration", "21"))
        data.add(ItemsViewModel("Friends", "22"))
        data.add(ItemsViewModel("Languages", "23"))
        data.add(ItemsViewModel("Ice cream", "24"))
        data.add(ItemsViewModel("Fixing things", "25"))
        data.add(ItemsViewModel("Week", "26"))
        data.add(ItemsViewModel("Ambitions", "27"))
        data.add(ItemsViewModel("Health", "28"))
        data.add(ItemsViewModel("Dreams", "29"))
        data.add(ItemsViewModel("Days off", "30"))

        return  data
    }

    fun DoNotWork():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()
        return  data

    }

    fun getQuestion1():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Do you work or are you a student?"))
        data.add(ItemQuestionModel("What work do you do? What subjects are you studying?"))
        data.add(ItemQuestionModel("Why did you choose that job?"))
        data.add(ItemQuestionModel("Why did you choose to study that subject?"))
        data.add(ItemQuestionModel("Do you like your job?"))
        data.add(ItemQuestionModel("Is there anything you dislike about your job?"))
        data.add(ItemQuestionModel("What do you like about your studies?"))
        data.add(ItemQuestionModel("What do you dislike about your studies?"))
        data.add(ItemQuestionModel("What was your dream job when you were young?"))
        data.add(ItemQuestionModel("Have you changed your mind on your dream job?"))

        return  data
    }

    fun getQuestion2():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Please describe your hometown a little."))
        data.add(ItemQuestionModel("What is your town well-known for?"))
        data.add(ItemQuestionModel("Do you like your home town"))
        data.add(ItemQuestionModel("is that a big city or a small place?"))
        data.add(ItemQuestionModel("How long have you been living there?"))
        data.add(ItemQuestionModel("Do you think you will continue living there for a long time?"))
        data.add(ItemQuestionModel("Would you like to live in the countryside in the future?"))
        data.add(ItemQuestionModel("Have you ever lived in the countryside?"))
        data.add(ItemQuestionModel("Do you ever spend time in the countryside?"))
        data.add(ItemQuestionModel("What is the difference between living in the countryside and the city?"))
        data.add(ItemQuestionModel("What do people living in the countryside like to do?"))
        data.add(ItemQuestionModel("What do you like to do in the countryside?"))
        data.add(ItemQuestionModel("How has your town changed over the last 20 years?"))

        return  data
    }

    fun getQuestion3():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What colour would you choose to paint the walls of your room?"))
        data.add(ItemQuestionModel("What colour would you never use in your home?"))
        data.add(ItemQuestionModel("Can you describe the place where you live?"))
        data.add(ItemQuestionModel("What kind of housing accommodation do you live in?"))
        data.add(ItemQuestionModel("What do you like about your flat?"))
        data.add(ItemQuestionModel("Which room does your family spend most of the time in?"))
        data.add(ItemQuestionModel("What can you see from the windows where you live?"))
        data.add(ItemQuestionModel("Do you prefer living in a house or a flat?"))
        data.add(ItemQuestionModel("What would you like to change in your flat?"))
        data.add(ItemQuestionModel("What do you dislike about your flat?"))

        return  data
    }

    fun getQuestion4():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("How often do you eat chocolate?"))
        data.add(ItemQuestionModel("Why do you think chocolate is popular all over the world?"))
        data.add(ItemQuestionModel("What's your favourite flavour of chocolate? "))
        data.add(ItemQuestionModel("Do you like chocolate?"))
        data.add(ItemQuestionModel("Did you like chocolate when you were a child?"))
        data.add(ItemQuestionModel("Did you give chocolate as a present to someone?"))

        return  data
    }

    fun getQuestion5():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("How do you feel in the morning after you stay up late?"))
        data.add(ItemQuestionModel("What were you doing when you stayed up late last time? "))
        data.add(ItemQuestionModel("Do you go to sleep early or stay up late?"))

        return  data
    }

    fun getQuestion6():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Are you interested in films about outer space and stars?"))
        data.add(ItemQuestionModel("Do you want to travel in the outer space?"))
        data.add(ItemQuestionModel("What would you do if you had an opportunity?"))
        data.add(ItemQuestionModel("Have you ever learnt about stars and outer space?"))
        data.add(ItemQuestionModel("Is it important to study stars?"))

        return  data
    }

    fun getQuestion7():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Why do some people wear a piece of jewelry for a long time?"))
        data.add(ItemQuestionModel("Do you like wearing jewelry?"))
        data.add(ItemQuestionModel("What type of jewelry do you like to buy?"))
        data.add(ItemQuestionModel("How often do you wear it?"))
        data.add(ItemQuestionModel("Do you wear a lot of jewelry?"))
        data.add(ItemQuestionModel("Have you ever sent someone jewelry as a gift?"))

        return  data
    }

    fun getQuestion8():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What kinds of music do you like to listen to?"))
        data.add(ItemQuestionModel("When did you start listening to that type of music?"))
        data.add(ItemQuestionModel("Do you often listen to music?"))
        data.add(ItemQuestionModel("When do you listen to music?"))
        data.add(ItemQuestionModel("How much time do you spend listening to music every day?"))
        data.add(ItemQuestionModel("How do you feel when you listen to it?"))

        return  data
    }

    fun getQuestion9():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Do you prefer buying things in big companies or from small businesses?"))
        data.add(ItemQuestionModel("Do you know many small businesses?"))

        return  data
    }

    fun getQuestion10():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What do you do in your spare time?"))
        data.add(ItemQuestionModel("What do you usually do at weekends?"))
        data.add(ItemQuestionModel("What did you do last weekend?"))
        data.add(ItemQuestionModel("Do you think it is important to make the most of your weekend?"))

        return  data
    }

    fun getQuestion11():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Would you buy T-shirts as souvenirs on vacation? "))
        data.add(ItemQuestionModel("Do you think older people who wear T-shirts are fashionable?"))
        data.add(ItemQuestionModel("Do you like T-shirts with pictures and prints? "))
        data.add(ItemQuestionModel("Do you usually wear T-shirts?"))
        data.add(ItemQuestionModel("Do you like wearing T-shirts?"))

        return  data
    }

    fun getQuestion12():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What will make you happy in the future? "))
        data.add(ItemQuestionModel("When do you feel happy at work? "))
        data.add(ItemQuestionModel("Do you feel happy when you buy new things? "))
        data.add(ItemQuestionModel("What made you happy when you were a child?"))

        return  data
    }

    fun getQuestion13():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Do you like modern art or traditional art? "))
        data.add(ItemQuestionModel("Do you like art?"))
        data.add(ItemQuestionModel("Do you think it would be interesting for you to be an artist?"))
        data.add(ItemQuestionModel("Is there any artwork on the wall in your room?"))
        data.add(ItemQuestionModel("Have you ever visited an art gallery?"))

        return  data
    }

    fun getQuestion14():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Have you ever locked yourself out? "))
        data.add(ItemQuestionModel("Do you think it's a good idea to leave your keys with a neighbour? "))
        data.add(ItemQuestionModel("Have you ever lost your keys?"))
        data.add(ItemQuestionModel("Do you always bring a lot of keys with you?"))

        return  data
    }

    fun getQuestion15():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Did you go to a library when you were a kid? "))
        data.add(ItemQuestionModel("What kind of people would go to a library to read and study?"))
        data.add(ItemQuestionModel("Do you often go to the library?"))
        data.add(ItemQuestionModel("Are libraries popular in your country?"))

        return  data
    }

    fun getQuestion16():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What changes would you like to see in your school? "))
        data.add(ItemQuestionModel("Do you go to a good school?"))
        data.add(ItemQuestionModel("Did you go to a good school?"))
        return  data
    }

    fun getQuestion17():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Do you often change your bags? ("))
        data.add(ItemQuestionModel("Is a bag an ideal gift? "))
        data.add(ItemQuestionModel("Do you like bags? What type of bags do you like?"))
        data.add(ItemQuestionModel("Do you have different bags for different occasions?"))
        data.add(ItemQuestionModel("Do you usually carry a bag when you go out?"))
        data.add(ItemQuestionModel("What do you put in your bag?"))
        data.add(ItemQuestionModel("When you are buying a bag, what factors do you consider?"))

        return  data
    }

    fun getQuestion18():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What's your favourite wild animal?"))
        data.add(ItemQuestionModel("Are there wild animals in your country?"))
        data.add(ItemQuestionModel("Have you ever seen wild animals?"))
        data.add(ItemQuestionModel("Where can we see wild animals?"))
        data.add(ItemQuestionModel("Do you like watching animals in the zoo?"))

        return  data
    }

    fun getQuestion19():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Do you prefer rainy days or sunny days?"))
        data.add(ItemQuestionModel("What do you do on rainy days?"))
        data.add(ItemQuestionModel("Do you like wet weather?"))
        data.add(ItemQuestionModel("Do you prefer wet or dry weather?"))
        data.add(ItemQuestionModel("Is there any part in your country where it doesn't rain much?"))
        data.add(ItemQuestionModel("What do you usually do when it starts to rain and you are outside?"))
        data.add(ItemQuestionModel("Do you think rain is good?"))
        data.add(ItemQuestionModel("How does rain affect life in your country?"))
        data.add(ItemQuestionModel("Have you ever had to change your plans because of the rain?"))

        return  data
    }

    fun getQuestion20():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Would you like to be a teacher?"))
        data.add(ItemQuestionModel("Do you think you could be a teacher?"))
        data.add(ItemQuestionModel("Did you have a favourite teacher?"))
        data.add(ItemQuestionModel("How did this teacher help you?"))

        return  data
    }

    fun getQuestion21():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Is it easy to stay focused in a noisy environment?"))
        data.add(ItemQuestionModel("Is it difficult for you to stay focused on something?"))
        data.add(ItemQuestionModel("Are you a focused person?"))
        data.add(ItemQuestionModel("What do you do to improve concentration?"))
        data.add(ItemQuestionModel("What do you do to help you concentrate?"))
        data.add(ItemQuestionModel("How do you stay focused? "))
        data.add(ItemQuestionModel("When is it hard to concentrate?"))
        data.add(ItemQuestionModel("What may disctract you when you are trying to stay focused?"))
        data.add(ItemQuestionModel("In what situations do you need to concentrate?"))
        data.add(ItemQuestionModel("When do you need to be focused?"))
        data.add(ItemQuestionModel("Is it easy for you to do two things simultaneously?"))
        return  data
    }

    fun getQuestion22():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Are friends important to you?"))
        data.add(ItemQuestionModel("What do you and your friends do together?"))
        data.add(ItemQuestionModel("Do you have many friends?"))
        data.add(ItemQuestionModel("Do you prefer one friend or many friends?"))
        data.add(ItemQuestionModel("Do your friends think that you are a good friend?"))
        data.add(ItemQuestionModel("What kind of friend do you want to meet in the future?"))
        data.add(ItemQuestionModel("What kind of people do you like to have as friends?"))
        data.add(ItemQuestionModel("Do you prefer to spend time with friends or alone?"))
        data.add(ItemQuestionModel("Do you like to spend time with friends?"))

        return  data
    }

    fun getQuestion23():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What foreign languages have you studied?"))
        data.add(ItemQuestionModel("Would you like to learn any foreign languages?"))
        data.add(ItemQuestionModel("Why did you choose to study that language?"))
        data.add(ItemQuestionModel("How did you learn that language?"))
        data.add(ItemQuestionModel("How long have you been learning that language?"))
        data.add(ItemQuestionModel("Would you say it's a difficult language to learn?"))

        return  data
    }

    fun getQuestion24():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Do you like ice cream?"))
        data.add(ItemQuestionModel("What is your favourite flavour of ice cream?"))

        return  data
    }

    fun getQuestion25():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Can you fix things?"))
        data.add(ItemQuestionModel("What things can you fix?"))

        return  data
    }

    fun getQuestion26():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What's your favourite day of the week?"))
        data.add(ItemQuestionModel("Please describe your typical daily routine"))
        data.add(ItemQuestionModel("Is there anything that you do every day?"))
        data.add(ItemQuestionModel("What do you usually do at weekends?"))

        return  data
    }

    fun getQuestion27():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("Do you think you are an ambitious person"))
        data.add(ItemQuestionModel("Are you an ambitious person?"))

        return  data
    }

    fun getQuestion28():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What kinds of exercises do you do?"))
        data.add(ItemQuestionModel("How do you keep healthy?"))
        data.add(ItemQuestionModel("What are your favourite sports?"))
        data.add(ItemQuestionModel("What sports help people stay healthy?"))

        return  data
    }

    fun getQuestion29():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What was your dream when you were a child?"))
        data.add(ItemQuestionModel("Are you the kind of person who sticks to dreams?"))

        return  data
    }

    fun getQuestion30():ArrayList<ItemQuestionModel>{

        val data=ArrayList<ItemQuestionModel>()

        data.add(ItemQuestionModel("What do you do when you have days off?"))
        data.add(ItemQuestionModel("When was the last time you had a few days off?"))
        return  data
    }

}