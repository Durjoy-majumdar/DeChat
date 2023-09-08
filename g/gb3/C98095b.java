package gb3;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: gb3.b */
public class C98095b {
    /* renamed from: a */
    public static String m126704a(String str) {
        if (Util.isNullOrNil(str) || str.length() == 0) {
            return str;
        }
        return Pattern.compile("&nbsp;", 2).matcher(Pattern.compile("<[^>]*>", 2).matcher(Pattern.compile("</p>", 2).matcher(Pattern.compile("<p [^>]*>", 2).matcher(Pattern.compile("<hr[^>]*>", 2).matcher(Pattern.compile("</wx-todo>", 2).matcher(Pattern.compile("</wx-li>", 2).matcher(Pattern.compile("<div>", 2).matcher(Pattern.compile("<br[^>]*>", 2).matcher(str).replaceAll("\n")).replaceAll("")).replaceAll("\n")).replaceAll("\n")).replaceAll("\n")).replaceAll("")).replaceAll("")).replaceAll("")).replaceAll(" ");
    }

    /* renamed from: b */
    public static ArrayList<String> m126705b(String str) {
        if (Util.isNullOrNil(str) || str.length() == 0) {
            return null;
        }
        String[] split = Pattern.compile("\n", 2).matcher(Pattern.compile("<div></div>", 2).matcher(Pattern.compile("</object>", 2).matcher(Pattern.compile("<hr[^>]*>", 2).matcher(Pattern.compile("<object[^>]*>", 2).matcher(Pattern.compile("<head[^>]*></head>", 2).matcher(Pattern.compile("<div><object[^>]*></object></div>", 2).matcher(str).replaceAll("<object>")).replaceAll("")).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#")).replaceAll("#WNNoteNode#<ThisisNoteNodeHrObj>#WNNoteNode#")).replaceAll("")).replaceAll("")).replaceAll("").replaceAll("<br>", "<br/>").trim().split("#WNNoteNode#");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            if (str2.length() > 0) {
                String replace = str2.replace("</div>", "<div>");
                int i = -1;
                if (replace.endsWith("<div>")) {
                    i = replace.lastIndexOf("<div>");
                }
                if (i > 0) {
                    replace = replace.substring(0, i);
                }
                arrayList.add(replace.replace("<div><br/>", "<div>"));
            }
        }
        return arrayList;
    }
}
