import java.util.stream.IntStream;

import static java.lang.Math.*;

public class main {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        /**
         이 밑에 보이는 두 string 변수에 디스크립터 넣으면 유사도 비교해줌
         클라이언트에서 console.log(resizedDetected[0].descripter) 하면 웹캠 찍었을 때 f12 개발자 모드에서 디스크립터 죄표 받을 수 있음
         0~99, 100~127좌표 복붙해서 getOriginalDescriptor, getNewDescriptor2 함수의 return 하고 " " 안에 좌표 복붙하면 됨
         */
        String originalDescriptor = getOriginalDescriptor();
        String newDescriptor = getNewDescriptor2();

        Double[] originToken = getDoubleToken(originalDescriptor);
        Double[] newToken = getDoubleToken(newDescriptor);

        double similarity = compareSimilarity(originToken, newToken);

//        for (double d : originToken) {
//            System.out.print(d);
//        }

        System.out.println(similarity);
    }


    private static double compareSimilarity(Double[] originToken, Double[] newToken) {
        double diff = Math.sqrt(
                IntStream.range(0, originToken.length)
                        .mapToDouble(i -> Math.pow(originToken[i] - newToken[i], 2))
                        .sum()
        );
        return diff;
    }


    private static Double[] getDoubleToken(String descriptor) {
        String[] lines = descriptor.split("\n");  // 문자열을 줄 단위로 분리하여 배열에 저장
        Double[] result = new Double[lines.length/3];
        int idx=0;
        for (int i = 2; i < lines.length; i += 3) {  // 인덱스 2부터 3씩 증가하며 3번째 줄씩 가져옴
            result[idx++] = Double.parseDouble(lines[i]);  // StringBuilder 객체에 줄 단위로 추가
        }
        return result;
    }

    private static String getOriginalDescriptor() {
        return "0\n" +
                ": \n" +
                "-0.05444609001278877\n" +
                "1\n" +
                ": \n" +
                "0.07898823171854019\n" +
                "2\n" +
                ": \n" +
                "0.06248875707387924\n" +
                "3\n" +
                ": \n" +
                "-0.07927580922842026\n" +
                "4\n" +
                ": \n" +
                "-0.1127907931804657\n" +
                "5\n" +
                ": \n" +
                "-0.025714099407196045\n" +
                "6\n" +
                ": \n" +
                "-0.07799699902534485\n" +
                "7\n" +
                ": \n" +
                "-0.13697192072868347\n" +
                "8\n" +
                ": \n" +
                "0.11121651530265808\n" +
                "9\n" +
                ": \n" +
                "-0.08364605903625488\n" +
                "10\n" +
                ": \n" +
                "0.2692031264305115\n" +
                "11\n" +
                ": \n" +
                "-0.11388259381055832\n" +
                "12\n" +
                ": \n" +
                "-0.23043861985206604\n" +
                "13\n" +
                ": \n" +
                "-0.10461883246898651\n" +
                "14\n" +
                ": \n" +
                "-0.060929976403713226\n" +
                "15\n" +
                ": \n" +
                "0.2232067734003067\n" +
                "16\n" +
                ": \n" +
                "-0.17788858711719513\n" +
                "17\n" +
                ": \n" +
                "-0.14790034294128418\n" +
                "18\n" +
                ": \n" +
                "0.016883453354239464\n" +
                "19\n" +
                ": \n" +
                "0.031021445989608765\n" +
                "20\n" +
                ": \n" +
                "0.03504036366939545\n" +
                "21\n" +
                ": \n" +
                "0.014628472737967968\n" +
                "22\n" +
                ": \n" +
                "0.04545246809720993\n" +
                "23\n" +
                ": \n" +
                "0.0534946545958519\n" +
                "24\n" +
                ": \n" +
                "-0.10584504157304764\n" +
                "25\n" +
                ": \n" +
                "-0.33091291785240173\n" +
                "26\n" +
                ": \n" +
                "-0.1488906592130661\n" +
                "27\n" +
                ": \n" +
                "-0.08115963637828827\n" +
                "28\n" +
                ": \n" +
                "-0.0019086215179413557\n" +
                "29\n" +
                ": \n" +
                "-0.0718049630522728\n" +
                "30\n" +
                ": \n" +
                "-0.10140995681285858\n" +
                "31\n" +
                ": \n" +
                "0.07034731656312943\n" +
                "32\n" +
                ": \n" +
                "-0.13483254611492157\n" +
                "33\n" +
                ": \n" +
                "-0.03745625913143158\n" +
                "34\n" +
                ": \n" +
                "0.08171391487121582\n" +
                "35\n" +
                ": \n" +
                "0.09617912024259567\n" +
                "36\n" +
                ": \n" +
                "0.005639595910906792\n" +
                "37\n" +
                ": \n" +
                "-0.10559920221567154\n" +
                "38\n" +
                ": \n" +
                "0.15993590652942657\n" +
                "39\n" +
                ": \n" +
                "0.028075596317648888\n" +
                "40\n" +
                ": \n" +
                "-0.22850432991981506\n" +
                "41\n" +
                ": \n" +
                "0.004146651364862919\n" +
                "42\n" +
                ": \n" +
                "0.07249952107667923\n" +
                "43\n" +
                ": \n" +
                "0.22131820023059845\n" +
                "44\n" +
                ": \n" +
                "0.1726556420326233\n" +
                "45\n" +
                ": \n" +
                "0.061818186193704605\n" +
                "46\n" +
                ": \n" +
                "0.04857040196657181\n" +
                "47\n" +
                ": \n" +
                "-0.15475015342235565\n" +
                "48\n" +
                ": \n" +
                "0.08564542233943939\n" +
                "49\n" +
                ": \n" +
                "-0.12832461297512054\n" +
                "50\n" +
                ": \n" +
                "0.06519041955471039\n" +
                "51\n" +
                ": \n" +
                "0.12002130597829819\n" +
                "52\n" +
                ": \n" +
                "0.0837511345744133\n" +
                "53\n" +
                ": \n" +
                "0.0571102499961853\n" +
                "54\n" +
                ": \n" +
                "-0.03960120677947998\n" +
                "55\n" +
                ": \n" +
                "-0.11789701879024506\n" +
                "56\n" +
                ": \n" +
                "0.01983906514942646\n" +
                "57\n" +
                ": \n" +
                "0.13345807790756226\n" +
                "58\n" +
                ": \n" +
                "-0.1306813806295395\n" +
                "59\n" +
                ": \n" +
                "0.02703644521534443\n" +
                "60\n" +
                ": \n" +
                "0.0883038267493248\n" +
                "61\n" +
                ": \n" +
                "-0.09921538084745407\n" +
                "62\n" +
                ": \n" +
                "-0.010766292922198772\n" +
                "63\n" +
                ": \n" +
                "-0.09381558001041412\n" +
                "64\n" +
                ": \n" +
                "0.21741671860218048\n" +
                "65\n" +
                ": \n" +
                "0.09579670429229736\n" +
                "66\n" +
                ": \n" +
                "-0.11517282575368881\n" +
                "67\n" +
                ": \n" +
                "-0.22406849265098572\n" +
                "68\n" +
                ": \n" +
                "0.11171357333660126\n" +
                "69\n" +
                ": \n" +
                "-0.1606743186712265\n" +
                "70\n" +
                ": \n" +
                "-0.1638605296611786\n" +
                "71\n" +
                ": \n" +
                "0.06897573918104172\n" +
                "72\n" +
                ": \n" +
                "-0.17302079498767853\n" +
                "73\n" +
                ": \n" +
                "-0.13495387136936188\n" +
                "74\n" +
                ": \n" +
                "-0.32021087408065796\n" +
                "75\n" +
                ": \n" +
                "-0.02887032739818096\n" +
                "76\n" +
                ": \n" +
                "0.38060420751571655\n" +
                "77\n" +
                ": \n" +
                "0.057684991508722305\n" +
                "78\n" +
                ": \n" +
                "-0.2016008496284485\n" +
                "79\n" +
                ": \n" +
                "0.030484415590763092\n" +
                "80\n" +
                ": \n" +
                "0.00841997005045414\n" +
                "81\n" +
                ": \n" +
                "-0.03566005453467369\n" +
                "82\n" +
                ": \n" +
                "0.0945073664188385\n" +
                "83\n" +
                ": \n" +
                "0.21253079175949097\n" +
                "84\n" +
                ": \n" +
                "0.006136950105428696\n" +
                "85\n" +
                ": \n" +
                "0.010228821076452732\n" +
                "86\n" +
                ": \n" +
                "-0.09484369307756424\n" +
                "87\n" +
                ": \n" +
                "-0.07053165137767792\n" +
                "88\n" +
                ": \n" +
                "0.2927654981613159\n" +
                "89\n" +
                ": \n" +
                "-0.10720853507518768\n" +
                "90\n" +
                ": \n" +
                "-0.022849779576063156\n" +
                "91\n" +
                ": \n" +
                "0.18616965413093567\n" +
                "92\n" +
                ": \n" +
                "-0.053560953587293625\n" +
                "93\n" +
                ": \n" +
                "0.11223641782999039\n" +
                "94\n" +
                ": \n" +
                "0.02637975662946701\n" +
                "95\n" +
                ": \n" +
                "0.03179303929209709\n" +
                "96\n" +
                ": \n" +
                "-0.023757891729474068\n" +
                "97\n" +
                ": \n" +
                "0.05675870180130005\n" +
                "98\n" +
                ": \n" +
                "-0.06652019917964935\n" +
                "99\n" +
                ": \n" +
                "-0.019729560241103172\n"+
                "100\n" +
                ": \n" +
                "-0.013319021090865135\n" +
                "101\n" +
                ": \n" +
                "-0.053636591881513596\n" +
                "102\n" +
                ": \n" +
                "-0.05742541328072548\n" +
                "103\n" +
                ": \n" +
                "0.10790473967790604\n" +
                "104\n" +
                ": \n" +
                "-0.1784258484840393\n" +
                "105\n" +
                ": \n" +
                "0.10838323831558228\n" +
                "106\n" +
                ": \n" +
                "-0.010367576964199543\n" +
                "107\n" +
                ": \n" +
                "-0.0004802033072337508\n" +
                "108\n" +
                ": \n" +
                "0.007360962685197592\n" +
                "109\n" +
                ": \n" +
                "-0.03517422825098038\n" +
                "110\n" +
                ": \n" +
                "-0.05618368089199066\n" +
                "111\n" +
                ": \n" +
                "-0.06004226952791214\n" +
                "112\n" +
                ": \n" +
                "0.16751612722873688\n" +
                "113\n" +
                ": \n" +
                "-0.238584965467453\n" +
                "114\n" +
                ": \n" +
                "0.19246891140937805\n" +
                "115\n" +
                ": \n" +
                "0.21086294949054718\n" +
                "116\n" +
                ": \n" +
                "0.0999995693564415\n" +
                "117\n" +
                ": \n" +
                "0.09686852991580963\n" +
                "118\n" +
                ": \n" +
                "0.1079038754105568\n" +
                "119\n" +
                ": \n" +
                "0.11762654781341553\n" +
                "120\n" +
                ": \n" +
                "0.005077197682112455\n" +
                "121\n" +
                ": \n" +
                "-0.026273922994732857\n" +
                "122\n" +
                ": \n" +
                "-0.18235896527767181\n" +
                "123\n" +
                ": \n" +
                "-0.036116305738687515\n" +
                "124\n" +
                ": \n" +
                "0.09749320894479752\n" +
                "125\n" +
                ": \n" +
                "-0.06631412357091904\n" +
                "126\n" +
                ": \n" +
                "0.08055930584669113\n" +
                "127\n" +
                ": \n" +
                "-0.0032473888713866472";
    }
    private static String getNewDescriptor() {
        return "0\n" +
                ": \n" +
                "-0.03545231744647026\n" +
                "1\n" +
                ": \n" +
                "0.11668804287910461\n" +
                "2\n" +
                ": \n" +
                "0.06399556994438171\n" +
                "3\n" +
                ": \n" +
                "-0.08112652599811554\n" +
                "4\n" +
                ": \n" +
                "-0.11059512197971344\n" +
                "5\n" +
                ": \n" +
                "-0.05760359764099121\n" +
                "6\n" +
                ": \n" +
                "-0.11358661204576492\n" +
                "7\n" +
                ": \n" +
                "-0.15579886734485626\n" +
                "8\n" +
                ": \n" +
                "0.093121737241745\n" +
                "9\n" +
                ": \n" +
                "-0.09494266659021378\n" +
                "10\n" +
                ": \n" +
                "0.28145766258239746\n" +
                "11\n" +
                ": \n" +
                "-0.14203207194805145\n" +
                "12\n" +
                ": \n" +
                "-0.243397057056427\n" +
                "13\n" +
                ": \n" +
                "-0.07539328932762146\n" +
                "14\n" +
                ": \n" +
                "-0.060286663472652435\n" +
                "15\n" +
                ": \n" +
                "0.21727228164672852\n" +
                "16\n" +
                ": \n" +
                "-0.17273062467575073\n" +
                "17\n" +
                ": \n" +
                "-0.17255304753780365\n" +
                "18\n" +
                ": \n" +
                "-0.0009660625946708024\n" +
                "19\n" +
                ": \n" +
                "0.0072918119840323925\n" +
                "20\n" +
                ": \n" +
                "0.02894017845392227\n" +
                "21\n" +
                ": \n" +
                "0.043646350502967834\n" +
                "22\n" +
                ": \n" +
                "0.05280199646949768\n" +
                "23\n" +
                ": \n" +
                "0.08797159045934677\n" +
                "24\n" +
                ": \n" +
                "-0.14901015162467957\n" +
                "25\n" +
                ": \n" +
                "-0.34288498759269714\n" +
                "26\n" +
                ": \n" +
                "-0.15700924396514893\n" +
                "27\n" +
                ": \n" +
                "-0.07613945007324219\n" +
                "28\n" +
                ": \n" +
                "-0.03272824361920357\n" +
                "29\n" +
                ": \n" +
                "-0.08257456123828888\n" +
                "30\n" +
                ": \n" +
                "-0.09339258074760437\n" +
                "31\n" +
                ": \n" +
                "0.07239694893360138\n" +
                "32\n" +
                ": \n" +
                "-0.16455142199993134\n" +
                "33\n" +
                ": \n" +
                "-0.04034634679555893\n" +
                "34\n" +
                ": \n" +
                "0.0944967269897461\n" +
                "35\n" +
                ": \n" +
                "0.11039674282073975\n" +
                "36\n" +
                ": \n" +
                "0.014980879612267017\n" +
                "37\n" +
                ": \n" +
                "-0.12895137071609497\n" +
                "38\n" +
                ": \n" +
                "0.1683202087879181\n" +
                "39\n" +
                ": \n" +
                "0.0898822769522667\n" +
                "40\n" +
                ": \n" +
                "-0.261483758687973\n" +
                "41\n" +
                ": \n" +
                "0.048434700816869736\n" +
                "42\n" +
                ": \n" +
                "0.07545685023069382\n" +
                "43\n" +
                ": \n" +
                "0.2535153329372406\n" +
                "44\n" +
                ": \n" +
                "0.17067576944828033\n" +
                "45\n" +
                ": \n" +
                "0.04341881349682808\n" +
                "46\n" +
                ": \n" +
                "0.026217520236968994\n" +
                "47\n" +
                ": \n" +
                "-0.1473638266324997\n" +
                "48\n" +
                ": \n" +
                "0.10197289288043976\n" +
                "49\n" +
                ": \n" +
                "-0.1403971016407013\n" +
                "50\n" +
                ": \n" +
                "0.06696788221597672\n" +
                "51\n" +
                ": \n" +
                "0.1378587931394577\n" +
                "52\n" +
                ": \n" +
                "0.08611135929822922\n" +
                "53\n" +
                ": \n" +
                "0.06760326772928238\n" +
                "54\n" +
                ": \n" +
                "-0.04678342863917351\n" +
                "55\n" +
                ": \n" +
                "-0.133770152926445\n" +
                "56\n" +
                ": \n" +
                "0.03914739564061165\n" +
                "57\n" +
                ": \n" +
                "0.14431172609329224\n" +
                "58\n" +
                ": \n" +
                "-0.16301269829273224\n" +
                "59\n" +
                ": \n" +
                "-0.041477564722299576\n" +
                "60\n" +
                ": \n" +
                "0.08950118720531464\n" +
                "61\n" +
                ": \n" +
                "-0.10254096984863281\n" +
                "62\n" +
                ": \n" +
                "-0.0005880299140699208\n" +
                "63\n" +
                ": \n" +
                "-0.09968642145395279\n" +
                "64\n" +
                ": \n" +
                "0.20727324485778809\n" +
                "65\n" +
                ": \n" +
                "0.13163210451602936\n" +
                "66\n" +
                ": \n" +
                "-0.10546980053186417\n" +
                "67\n" +
                ": \n" +
                "-0.2194390892982483\n" +
                "68\n" +
                ": \n" +
                "0.08024066686630249\n" +
                "69\n" +
                ": \n" +
                "-0.1642540544271469\n" +
                "70\n" +
                ": \n" +
                "-0.15224358439445496\n" +
                "71\n" +
                ": \n" +
                "0.10817506164312363\n" +
                "72\n" +
                ": \n" +
                "-0.16423045098781586\n" +
                "73\n" +
                ": \n" +
                "-0.12658637762069702\n" +
                "74\n" +
                ": \n" +
                "-0.31470030546188354\n" +
                "75\n" +
                ": \n" +
                "-0.0033214055001735687\n" +
                "76\n" +
                ": \n" +
                "0.38377493619918823\n" +
                "77\n" +
                ": \n" +
                "0.0632583275437355\n" +
                "78\n" +
                ": \n" +
                "-0.21551062166690826\n" +
                "79\n" +
                ": \n" +
                "0.029004614800214767\n" +
                "80\n" +
                ": \n" +
                "0.014105565845966339\n" +
                "81\n" +
                ": \n" +
                "-0.020845407620072365\n" +
                "82\n" +
                ": \n" +
                "0.08750907331705093\n" +
                "83\n" +
                ": \n" +
                "0.20046742260456085\n" +
                "84\n" +
                ": \n" +
                "0.008678564801812172\n" +
                "85\n" +
                ": \n" +
                "0.035018883645534515\n" +
                "86\n" +
                ": \n" +
                "-0.09744332730770111\n" +
                "87\n" +
                ": \n" +
                "-0.06670518964529037\n" +
                "88\n" +
                ": \n" +
                "0.28226178884506226\n" +
                "89\n" +
                ": \n" +
                "-0.09303241223096848\n" +
                "90\n" +
                ": \n" +
                "-0.03359910473227501\n" +
                "91\n" +
                ": \n" +
                "0.19918636977672577\n" +
                "92\n" +
                ": \n" +
                "-0.04850127920508385\n" +
                "93\n" +
                ": \n" +
                "0.12396933138370514\n" +
                "94\n" +
                ": \n" +
                "0.07672834396362305\n" +
                "95\n" +
                ": \n" +
                "0.03222508355975151\n" +
                "96\n" +
                ": \n" +
                "-0.08224350959062576\n" +
                "97\n" +
                ": \n" +
                "0.026642395183444023\n" +
                "98\n" +
                ": \n" +
                "-0.08153722435235977\n" +
                "99\n" +
                ": \n" +
                "-0.023345010355114937\n"+
                "100\n" +
                ": \n" +
                "-0.05386485904455185\n" +
                "101\n" +
                ": \n" +
                "-0.01738324947655201\n" +
                "102\n" +
                ": \n" +
                "-0.09577217698097229\n" +
                "103\n" +
                ": \n" +
                "0.08588366955518723\n" +
                "104\n" +
                ": \n" +
                "-0.1874314248561859\n" +
                "105\n" +
                ": \n" +
                "0.12827907502651215\n" +
                "106\n" +
                ": \n" +
                "-0.0015526461647823453\n" +
                "107\n" +
                ": \n" +
                "-0.05692623183131218\n" +
                "108\n" +
                ": \n" +
                "-0.031038625165820122\n" +
                "109\n" +
                ": \n" +
                "-0.03367068991065025\n" +
                "110\n" +
                ": \n" +
                "-0.02006773091852665\n" +
                "111\n" +
                ": \n" +
                "-0.06843053549528122\n" +
                "112\n" +
                ": \n" +
                "0.1440238654613495\n" +
                "113\n" +
                ": \n" +
                "-0.273948609828949\n" +
                "114\n" +
                ": \n" +
                "0.16801001131534576\n" +
                "115\n" +
                ": \n" +
                "0.1911313682794571\n" +
                "116\n" +
                ": \n" +
                "0.07816925644874573\n" +
                "117\n" +
                ": \n" +
                "0.1320674568414688\n" +
                "118\n" +
                ": \n" +
                "0.11097653210163116\n" +
                "119\n" +
                ": \n" +
                "0.0947764441370964\n" +
                "120\n" +
                ": \n" +
                "-0.03357710316777229\n" +
                "121\n" +
                ": \n" +
                "-0.029151231050491333\n" +
                "122\n" +
                ": \n" +
                "-0.1726333647966385\n" +
                "123\n" +
                ": \n" +
                "-0.06243448331952095\n" +
                "124\n" +
                ": \n" +
                "0.12619531154632568\n" +
                "125\n" +
                ": \n" +
                "-0.058155205100774765\n" +
                "126\n" +
                ": \n" +
                "0.09172102808952332\n" +
                "127\n" +
                ": \n" +
                "-0.04644979164004326";
    }

    // 이건 엄희승 특징좌표
    private static String getNewDescriptor2() {
        return  "0\n" +
                ": \n" +
                "-0.07280131429433823\n" +
                "1\n" +
                ": \n" +
                "0.07147456705570221\n" +
                "2\n" +
                ": \n" +
                "0.03360281512141228\n" +
                "3\n" +
                ": \n" +
                "-0.11494145542383194\n" +
                "4\n" +
                ": \n" +
                "-0.10987869650125504\n" +
                "5\n" +
                ": \n" +
                "-0.026055019348859787\n" +
                "6\n" +
                ": \n" +
                "-0.036600951105356216\n" +
                "7\n" +
                ": \n" +
                "-0.15900442004203796\n" +
                "8\n" +
                ": \n" +
                "0.16476687788963318\n" +
                "9\n" +
                ": \n" +
                "-0.14159038662910461\n" +
                "10\n" +
                ": \n" +
                "0.26199084520339966\n" +
                "11\n" +
                ": \n" +
                "-0.04736635088920593\n" +
                "12\n" +
                ": \n" +
                "-0.23900572955608368\n" +
                "13\n" +
                ": \n" +
                "-0.16716766357421875\n" +
                "14\n" +
                ": \n" +
                "-0.040360867977142334\n" +
                "15\n" +
                ": \n" +
                "0.18172357976436615\n" +
                "16\n" +
                ": \n" +
                "-0.16960252821445465\n" +
                "17\n" +
                ": \n" +
                "-0.14801272749900818\n" +
                "18\n" +
                ": \n" +
                "-0.0069051748141646385\n" +
                "19\n" +
                ": \n" +
                "0.0340571366250515\n" +
                "20\n" +
                ": \n" +
                "0.10049150139093399\n" +
                "21\n" +
                ": \n" +
                "-0.00891660526394844\n" +
                "22\n" +
                ": \n" +
                "0.05889912322163582\n" +
                "23\n" +
                ": \n" +
                "0.05312834680080414\n" +
                "24\n" +
                ": \n" +
                "-0.14956538379192352\n" +
                "25\n" +
                ": \n" +
                "-0.33416369557380676\n" +
                "26\n" +
                ": \n" +
                "-0.09195606410503387\n" +
                "27\n" +
                ": \n" +
                "-0.05066554993391037\n" +
                "28\n" +
                ": \n" +
                "-0.07910829037427902\n" +
                "29\n" +
                ": \n" +
                "-0.04480811581015587\n" +
                "30\n" +
                ": \n" +
                "-0.05797587335109711\n" +
                "31\n" +
                ": \n" +
                "0.05558997020125389\n" +
                "32\n" +
                ": \n" +
                "-0.17566710710525513\n" +
                "33\n" +
                ": \n" +
                "-0.06167164072394371\n" +
                "34\n" +
                ": \n" +
                "0.04650222882628441\n" +
                "35\n" +
                ": \n" +
                "0.07447924464941025\n" +
                "36\n" +
                ": \n" +
                "-0.02445264346897602\n" +
                "37\n" +
                ": \n" +
                "-0.040386226028203964\n" +
                "38\n" +
                ": \n" +
                "0.21160154044628143\n" +
                "39\n" +
                ": \n" +
                "-0.00046924425987526774\n" +
                "40\n" +
                ": \n" +
                "-0.24764052033424377\n" +
                "41\n" +
                ": \n" +
                "0.013376053422689438\n" +
                "42\n" +
                ": \n" +
                "0.03634122759103775\n" +
                "43\n" +
                ": \n" +
                "0.2471679300069809\n" +
                "44\n" +
                ": \n" +
                "0.1867654174566269\n" +
                "45\n" +
                ": \n" +
                "-0.029355915263295174\n" +
                "46\n" +
                ": \n" +
                "0.019465211778879166\n" +
                "47\n" +
                ": \n" +
                "-0.1387268453836441\n" +
                "48\n" +
                ": \n" +
                "0.1836506575345993\n" +
                "49\n" +
                ": \n" +
                "-0.1560218185186386\n" +
                "50\n" +
                ": \n" +
                "0.03278297185897827\n" +
                "51\n" +
                ": \n" +
                "0.15921840071678162\n" +
                "52\n" +
                ": \n" +
                "0.1005554124712944\n" +
                "53\n" +
                ": \n" +
                "0.012566722929477692\n" +
                "54\n" +
                ": \n" +
                "-0.02020709589123726\n" +
                "55\n" +
                ": \n" +
                "-0.11678598821163177\n" +
                "56\n" +
                ": \n" +
                "0.035175323486328125\n" +
                "57\n" +
                ": \n" +
                "0.13042543828487396\n" +
                "58\n" +
                ": \n" +
                "-0.1265634298324585\n" +
                "59\n" +
                ": \n" +
                "0.007879717275500298\n" +
                "60\n" +
                ": \n" +
                "0.12394937872886658\n" +
                "61\n" +
                ": \n" +
                "-0.10663945227861404\n" +
                "62\n" +
                ": \n" +
                "-0.054674942046403885\n" +
                "63\n" +
                ": \n" +
                "-0.08459080010652542\n" +
                "64\n" +
                ": \n" +
                "0.16325944662094116\n" +
                "65\n" +
                ": \n" +
                "0.04870595782995224\n" +
                "66\n" +
                ": \n" +
                "-0.14738819003105164\n" +
                "67\n" +
                ": \n" +
                "-0.23624786734580994\n" +
                "68\n" +
                ": \n" +
                "0.06935835629701614\n" +
                "69\n" +
                ": \n" +
                "-0.10313743352890015\n" +
                "70\n" +
                ": \n" +
                "-0.07155565917491913\n" +
                "71\n" +
                ": \n" +
                "0.04957813397049904\n" +
                "72\n" +
                ": \n" +
                "-0.24115349352359772\n" +
                "73\n" +
                ": \n" +
                "-0.20052455365657806\n" +
                "74\n" +
                ": \n" +
                "-0.3018069863319397\n" +
                "75\n" +
                ": \n" +
                "0.001441066968254745\n" +
                "76\n" +
                ": \n" +
                "0.32935160398483276\n" +
                "77\n" +
                ": \n" +
                "0.0702085942029953\n" +
                "78\n" +
                ": \n" +
                "-0.21736399829387665\n" +
                "79\n" +
                ": \n" +
                "0.019959086552262306\n" +
                "80\n" +
                ": \n" +
                "-0.029389763250947\n" +
                "81\n" +
                ": \n" +
                "0.04526157304644585\n" +
                "82\n" +
                ": \n" +
                "0.11368975043296814\n" +
                "83\n" +
                ": \n" +
                "0.15856677293777466\n" +
                "84\n" +
                ": \n" +
                "0.016544537618756294\n" +
                "85\n" +
                ": \n" +
                "0.05702301114797592\n" +
                "86\n" +
                ": \n" +
                "-0.10619992017745972\n" +
                "87\n" +
                ": \n" +
                "0.02094249613583088\n" +
                "88\n" +
                ": \n" +
                "0.19588997960090637\n" +
                "89\n" +
                ": \n" +
                "-0.1043352261185646\n" +
                "90\n" +
                ": \n" +
                "-0.04469035938382149\n" +
                "91\n" +
                ": \n" +
                "0.25907817482948303\n" +
                "92\n" +
                ": \n" +
                "-0.01530725322663784\n" +
                "93\n" +
                ": \n" +
                "0.1193448007106781\n" +
                "94\n" +
                ": \n" +
                "0.03653614968061447\n" +
                "95\n" +
                ": \n" +
                "0.004682328086346388\n" +
                "96\n" +
                ": \n" +
                "-0.0705745741724968\n" +
                "97\n" +
                ": \n" +
                "0.10239928960800171\n" +
                "98\n" +
                ": \n" +
                "-0.14933739602565765\n" +
                "99\n" +
                ": \n" +
                "0.07560127973556519\n" +
                "100\n" +
                ": \n" +
                "0.02968691848218441\n" +
                "101\n" +
                ": \n" +
                "-0.05171779543161392\n" +
                "102\n" +
                ": \n" +
                "0.026532519608736038\n" +
                "103\n" +
                ": \n" +
                "0.10255862027406693\n" +
                "104\n" +
                ": \n" +
                "-0.13734129071235657\n" +
                "105\n" +
                ": \n" +
                "0.15071655809879303\n" +
                "106\n" +
                ": \n" +
                "-0.02481881156563759\n" +
                "107\n" +
                ": \n" +
                "0.08693727105855942\n" +
                "108\n" +
                ": \n" +
                "-0.003963980358093977\n" +
                "109\n" +
                ": \n" +
                "-0.0629735067486763\n" +
                "110\n" +
                ": \n" +
                "-0.14552243053913116\n" +
                "111\n" +
                ": \n" +
                "-0.07487903535366058\n" +
                "112\n" +
                ": \n" +
                "0.1129797101020813\n" +
                "113\n" +
                ": \n" +
                "-0.17074944078922272\n" +
                "114\n" +
                ": \n" +
                "0.2023521214723587\n" +
                "115\n" +
                ": \n" +
                "0.15914617478847504\n" +
                "116\n" +
                ": \n" +
                "0.11646899580955505\n" +
                "117\n" +
                ": \n" +
                "0.0931430459022522\n" +
                "118\n" +
                ": \n" +
                "0.15956774353981018\n" +
                "119\n" +
                ": \n" +
                "0.04235387593507767\n" +
                "120\n" +
                ": \n" +
                "0.007083744741976261\n" +
                "121\n" +
                ": \n" +
                "0.03965720534324646\n" +
                "122\n" +
                ": \n" +
                "-0.20015883445739746\n" +
                "123\n" +
                ": \n" +
                "0.02734406478703022\n" +
                "124\n" +
                ": \n" +
                "0.1106424406170845\n" +
                "125\n" +
                ": \n" +
                "-0.06670408695936203\n" +
                "126\n" +
                ": \n" +
                "0.1199755147099495\n" +
                "127\n" +
                ": \n" +
                "-0.0362345427274704";
    }

}
