package extraLarge;

/**
 * The goal of this program is to obtain a HEALTHY
 * and SUSTAINABLE relationship,darling.
 * 亲爱的，这个程序的目标是获得一个健康且持久的关系。
 *
 * @author Cassie Wei from Mili
 */
public class sustainPlusPlus {
    public static void main(String[] args) {
        // 创建一个新的世界，并创建两个幽灵（生命），分别为“我”和“你”
        World world = new World();
        Life me = new Ghost();
        Life you = new Ghost();

        /*
         * If abstraction is the definition of beauty
         * 如果说事物的抽象化才是美的定义
         * Are those of us chasing after clarity
         * 那么，追随明确性的我们
         * A representation of ugly?
         * 是否象征丑恶？
         */
        // 将世界中的一切按照美排序
        world.getObjects().sortByAttribute("beauty");
        // 如果最美的事物包含有“抽象”的艺术标签
        if (world.getObjects().getFirst().getArtTags().indexOf("abstract") != -1) {
            // 那么，给我和你都加上丑恶的属性
            me.addPhysicalAttribute("ugly");
            you.addPhysicalAttribute("ugly");
        }
        // 在丑恶程度上，我和你同为第一
        world.giveBestAward("ugly", me);
        world.giveBestAward("ugly", you);

        /*
         * CALL ME MOMMY
         * 叫我妈咪
         * JUST LIKE YOUR FANTASY
         * 就像你妄想的那样
         * There is no crime in ideality
         * 梦淫无罪
         */
        // 如果你的癖好中有恋母
        if (you.getFetishes().searchByType("name calling", "mommy") != -1) {
            // 那么将我加入到你的记忆之中，成为你脑中的妈咪
            you.addToMemory(me);
            you.setNicknameFor(you.getMemory(me), "mommy");
        }
        // 对世界添加“恋母情结是被允许的”的规则
        Rule r = new Rule("Oedipus complex is okay", true);
        world.addRule(r);

        /*
         * MUX>>DEMUX
         * Can't you understand me?
         * 明白了吗？
         * I'm not mine NAND I'm not yours
         * 我不属于我 NAND 我不属于你
         * Ah
         */
        // 你尝试解读我给你所说的话语
        try {
            you.decodeMessage(
              me.codeMessage("I'm not mine NAND I'm not yours.", "mux"),
              "mux"
            );
        } catch (InsufficientIntelligenceQuotientException e) {
            // 如果出现 智商不足 的错误，
            // 则对你说，“哦，你这个小笨蛋”
            world.sendMessage("Oh you dummy.", you);
            me.announce("Ah");
        }

        /*
         * This could end right here if you don't let it out
         * 如果你不愿吐出真心，我们的一切也就此结束
         * Let it out
         * 我们的一切也就此结束
         */
        // 如果你有任何想法
        if (you.getThoughts().size() != 0) {
            try {
                // 你一定要把所有的真心都告诉我
                you.sayTo(you.getThoughts(), me);
                you.clearThoughts();
            } catch (TooMuchOfAPussyException e) {
                // 但若是因为你太过懦弱，我们的关系会就此结束
                world.getRelationship(me, you).end();
            }

            /*
             * Give up or give me your all
             * 选择放手弃权 还是选择为我暴露出你的全部？
             * Tell me now
             * 快告诉我
             * Tell me now
             * 快告诉我
             */
            // 如果你对我的爱不足一半
            if (you.getMemories(me).getLove() > 0.5) {
                // 我们将会形同陌路
                world.getRelationship(me, you).setSustain(0);
            } else {
                // 亦或者 你将你所有的内心与属性转嫁于我
                you.transferThoughts(me);
                you.transferAttributes(me);

                // 我们之间的关系也就更加稳固
                // sustain++;
                world.getRelationship(me, you).increaseSustain();
            }
        }

        /*
         * If we can be completely simulated
         * 如果我们的一切可以被模拟重现
         * Do we need a real reality?
         * 我们是否还需要真正的现实？
         */
        // 创建一个关于我的新的模拟
        Simulation s = new Simulation(me, world, 1993, 227760);
        // 如果和本我100%相同，则处决现实的我
        if (s.compareToOriginal(me) == 100) {
            world.execute(me);
        }

        /*
         * Don't let words die, let love run dry
         * 不要让话语死去，不要让爱干涸
         * Like what we did to the rivers we killed off in our near future
         * 像那一条条在不远的未来被我们屠杀的河川那样
         * Ah
         */
        // 在我们关系的稳固度超过世界上所有的河流之数之前，
        // 我对你说“我爱你”，而你也对着我说“我爱你”
        for (int sustain = 0; sustain < world.getRiver().size(); sustain++) {
            me.sayTo("I love you.", you);
            you.sayTo("I love you.", me);
        }

        /*
         * And mumble some stupid stuff
         * 咕嘟那些愚蠢痴话
         * Like
         * 说着
         * "I saw it coming"
         * “我早就知道会成为这样”
         * Pretend it's not happening
         * 但却视而不见
         * Us losers do nothing so winners keep winning
         * 只因败者的我们不愿行动，胜者永是胜者
         */
        // 对于愚昧、痴笨、小气、视而不见的话题，你我都不能再提起
        String[] tags = {"stupid", "dumb", "petty", "ignorant"};
        world.mute(me, tags);
        world.mute(you, tags);
        // 世界中的前1 % 的它们，我们将一一挑战
        for (Life them : world.getLifeTopOnePercent()) {
            me.fight(them);
            you.fight(them);
        }

        /*
         * Sit
         * 左下
         * Fetch your leash
         * 拿来狗带
         * DICTATED ECONOMY
         * 被主宰的经济
         */
        // 我命令你坐下
        me.command(you, "sit");
        // 我命令你拿回狗带
        me.command(you, "fetch");
        // 你支付给我所有的财物，作为学费
        you.pay(me, you.getFinanceProperties(), "educational purposes");

        /*
         * Show me
         * 给我看看
         * Your belly
         * 小肚皮
         * FORGOTTEN ECOLOGY
         * 被遗忘的生态
         */
        // 我命令你脱下
        me.command(you, "strip");
        // 我命令你展示
        me.command(you, "exhibit");
        // 将你定义为“流氓”的环境污染
        world.addPollution("environmental", "indecency", you);


        /*
         * Stay
         * 不许动
         * Okay, eay
         * 好，可以吃啦
         * HUMAN PSYCHOLOGY
         * 人性心理
         */
        // 我命令你静止
        me.command(you, "stay");
        // 我命令你进食
        me.command(you, "eat");
        // 你爱上了我
        you.love(me);


        /*
         * g 0 0 d   b o i
         * 乖乖男孩
         * Here's a treat
         * 奖励你一粒小零食
         * HUNGRY FOR ENERGY
         * 渴望能源
         */
        // 我赞扬你“乖孩子”
        me.praise(you, "Good boy.");
        // 我赠给你肉
        me.gift(you, "meat");
        // 你全部吃尽
        you.consumeLast();


        /*
         * We are searching
         * 我们在寻找
         * Following our human instincts
         * 跟随着人类本能
         * Looking for ghosts of the non-existing kind
         * 寻找那不存于这世界的特别品种的幽灵
         * Who make us whole from the very beginning
         * 从出生那瞬间即能完成我们的那个品种
         */
        // 找寻世界上与我相关的所有幽灵
        Ghost[] findings = world.search(me, "ghost");
        Ghost[] parents = new Ghost[2];
        for (Ghost g : findings) {
            // 对于其中每一个幽灵，先将其认为家人
            me.addFamily(g);
            if (me.isHappy()) {
                // 若我开心之时，则将它们认为我的父
                if (parents[0] == null) {
                    parents[0] = g;
                }
                // 亦或是母
                else if (parents[1] == null) {
                    parents[1] = g;
                }
                // 但“我”从不开心，也永将不会开心
                else {
                    // IGNORED because 'me' is never happy
                    // and will never be happy anyway
                }
            }
            // 最后，将它剔除出我的家庭
            me.removeFamily(g);
        }


        /*
         * We keep chasing
         * 不停地寻找
         * Dreaming about the perfect being
         * 梦想那完美的存在
         * Perfect parents who are non-exiting
         * 那不存于这世界的完美的双亲
         * Our bodies grew, our minds stayed the same
         * 我们的身体茁壮成长，内心却永远幼稚
         */
        // 如果我我所找寻到的正是我理想的双亲
        if (me.getDreamParents().equals(parents)) {
            // 它们也就成为了我的双亲
            me.setParents(parents);
        } else {
            // 如若不符合，我则大发脾气
            me.throwTantrum();
        }


        // 我不断的问你，“我们从何而去？”
        /*
         * Now darling, where do we go from here?
         * 哪，亲爱的，我们从何而去？
         */
        me.ask(you, "Where do we go from here?");

        /*
         * Now darling, where do we go from here?
         * 哪，亲爱的，我们从何而去？
         */
        me.ask(you, "Where do we go from here?");

        /*
         * Now darling, where do we go from here?
         * 哪，亲爱的，我们从何而去？
         */
        me.ask(you, "Where do we go from here?");

        /*
         * Darling, darling
         * 亲爱的，亲爱的
         */
        // 我呼唤你
        me.callFor(you);
        me.callFor(you);

        // 而你也反问我，我们从何而去？
        /*
         * Hey honey, where do we go from here?
         * 喂，宝贝，我们从何而去？
         */
        you.ask(me, "Where do we go from here?");

        /*
         * Hey honey, where do we go from here?
         * 喂，宝贝，我们从何而去？
         */
        you.ask(me, "Where do we go from here?");

        /*
         * Now darling, where do we go from here?
         * 哪，亲爱的，我们从何而去？
         */
        me.ask(you, "Where do we go from here?");

        /*
         * Now darling, where do we go from here?
         * 哪，亲爱的，我们从何而去？
         */
        me.ask(you, "Where do we go from here?");

        // 我问着这个世界，从何而去？
        /*
         * To where?
         * 从何而去？
         */
        me.ask(world, "To where?");


        /*
         * CALL ME DADDY
         * 叫我爹地
         * WHERE"S YOUR "YES SIR" & "PLEASE"?
         * 听不见你的“是的先生”呀？你的“请”去哪里了？
         * That's the only vocabulary you need
         * 其他的词汇对你来说没有必要
         */
        // 将你记忆中对我的称呼设为爹地
        you.setNicknameFor(you.getMemory(me), "daddy");
        // 将你所有的词汇设为 先生 是 不 请 谢谢 主人 红 绿 黄
        String[] vocab = {"sir", "yes", "no", "please", "thank you", "master",
          "red", "green", "yellow"};
        you.setVocabulary(vocab);


        /*
         * MUX>>>DEMUX
         * Can't you understand me?
         * 明白了吗
         * You turn my screen #0000ff
         * 你为我刷#0000ff屏
         */
        // 你使我迷失了方向
        you.disorient(me);


        /*
         * We could end right here if you'd just let us fall
         * 如果你肯让我们一起坠落，我们也就此结束
         * Let us fall
         * 我们也就此结束
         */
        // 你的所有抗争之中
        for (War w : you.getOngoingFights()) {
            // 若是有一个处于劣势
            if (w.getScore(you) < 0.5) {
                // 我和你都将被处决
                world.execute(me);
                world.execute(you);
            }
        }


        /*
         * No tears, no regrets
         * 不落泪，不后悔
         * No zero-days at our fault
         * 零日漏洞不是我们的过错
         */
        // 清除我和你的悲伤记忆
        me.setMemory("sad", null);
        you.setMemory("sad", null);
        // 清除我和你的后悔记忆
        me.setMemory("regretful", null);
        you.setMemory("regretful", null);
        // 清除掉所有的零日漏洞的作者
        Vulnerability zeroDays = world.getVulnerabilities().getZeroDays();
        for (Vulnerability v : zeroDays) {
            v.setAuthors(null);
        }


        /*
         * Hear me out
         * 听我说
         * It's a perfect plan
         * 我想出了一个完美的计划
         */
        // 我命令你听
        me.command(you, "listen");
        // 我对你说，”任何于你不利的东西，我都将为你抹除它们“
        me.sayTo("Anything inconvenient, I shall erase for you.", you);


        /*
         * If you'd just
         * 只要你肯
         * SHUT UP
         * 闭嘴
         * SHUT UP
         * 闭嘴
         * Then maybe you'll see what I've endured now.
         * 也许你就能听见我至今所忍耐的一切
         */
        // 我命令你安静
        me.command(you, "be quite");
        // 我命令你保持安静
        me.command(you, "be quite");
        // 我让你心灵感应到我的所有诉说
        try {
            you.listenTelepathically(me, world);
        } catch (NotAMindReaderException e) {
            // 但因为你不是一个读心者，我们的关系就此产生动摇
            world.getRelationship(me, you).challenge();
        }


        /*
         * Hear me out
         * 听我说
         * LILULILALULALULA
         */
        // 我命令你听我所说
        me.command(you, "listen");
        // "我所做的这一切都是为了你"
        me.sayTo("I did it all for you.", you);
        // 而你忽略的所有命令
        you.ignoreCommands();
        // 也抛开了所有的话语
        you.setMessages(null);


        /*
         * It's all just sunk cost, I know
         * 我知道，为你付出的所有 都已是无法回收的沉没成本
         * But I'm not ready to stop
         * 但我还是不能放手
         */
        // 我乞求着你
        me.manipulate(you, "beg");
        // 我谩骂着你
        me.manipulate(you, "gaslight");
        // 我责备着你
        me.manipulate(you, "blame");
        // 我对着你流泪
        me.manipulate(you, "tears");
        // 但你我的关系还是就此终结
        world.getRelationship(me, you).end();
        // 你也清空了关于我的记忆
        you.setMemory(me, null);


        /*
         * I don't want to stop
         * 不想放手
         */
        // 我回忆着你的积极
        me.getMemory(you, "positive");
        // 我回忆着与你的约会
        me.getMemory(you, "date");
        // 我回忆着与你的乐趣
        me.getMemory(you, "fun");
        // 我回忆着与你的旅行
        me.getMemory(you, "travel");
        // 我回忆着与你的婚礼
        me.getMemory(you, "wedding");
        // 我回忆着你的妊娠
        me.getMemory(you, "pregnancy");
        // 我回忆着与你的孩子
        me.getMemory(you, "kids");
        // 我回忆着与你的依偎
        me.getMemory(you, "snuggle");
        // 我回忆着与你一起看网飞
        me.getMemory(you, "netflix&chill");
        // 我回忆着与你一起打游戏
        me.getMemory(you, "gaming");
        // 我回忆着与你一起过生日
        me.getMemory(you, "birthday");
        // 我回忆着与你一起下厨
        me.getMemory(you, "cooking");
        // 我回忆着与你一起锻炼
        me.getMemory(you, "exercising");
        // 我回忆着与你一起学习
        me.getMemory(you, "studying");
        // 我回忆着与你一起修花
        me.getMemory(you, "gardening");
        // 我回忆着与你一起做家务
        me.getMemory(you, "chores");
        // 我回忆着与你一起购物
        me.getMemory(you, "shopping");
        // 我回忆着与你一起开车
        me.getMemory(you, "driving");
        // 我回忆着与你一起的日常
        me.getMemory(you, "daily");
        // 我回忆着与你的悲伤
        me.getMemory(you, "sad");
        // 我回忆着与你的生气
        me.getMemory(you, "angry");
        // 我回忆着与你的争斗
        me.getMemory(you, "fight");
        // 我回忆着与你的和解
        me.getMemory(you, "forgiveness");
        // 我回忆着对你的补偿
        me.getMemory(you, "makeup");
        // 我回忆着你的一切
        me.getMemory(you);
        // 但我们的关系还是消失不见
        world.setRelationship(me, you, null);


        //    a
        // u
        //     i
        //  s
        //         ;
        //     i
        //   t
        //  s      ;
        //    a n +
        //  s    +
        //s  t
        //  s a  +
        // u   in +
        //s        ;
        //   ta n+
        //       ++
        // u t  n +
        //s    in
        //   t  n+ ;
        //  s a
        //s  t i  +
        // u   i + ;
        //s   a n +
        //  s    +
        // u t i +
        //s st i  +
        // us a n +;
        //  s ain+
        //su  ai  +;
        //s  tain  ;
        // ust  n +
        //s stai + ;
        //su t in +;
        // ustain++
        //sustain++;
        //sustain++;
        //sustain++;
        //sustain++;
        //sustain++;
        //sustain++;
        //sustain++;
    }
}
