package f32;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.message.C68070l;

/* renamed from: f32.f */
public class C45746f {
    /* renamed from: a */
    public static void m51029a(StringBuilder sb, IEmojiInfo iEmojiInfo, int i) {
        if (iEmojiInfo != null) {
            sb.append("<emoji>");
            sb.append("<localreceivestatus>");
            sb.append(i);
            sb.append("</localreceivestatus>");
            sb.append("<md5>");
            sb.append(C68070l.C68072b.m80417g(iEmojiInfo.mo62676i0()));
            sb.append("</md5>");
            sb.append("<type>");
            sb.append(iEmojiInfo.getType());
            sb.append("</type>");
            sb.append("<width>");
            sb.append(iEmojiInfo.getWidth());
            sb.append("</width>");
            sb.append("<height>");
            sb.append(iEmojiInfo.getHeight());
            sb.append("</height>");
            sb.append("<len>");
            sb.append(iEmojiInfo.getSize());
            sb.append("</len>");
            sb.append("<aeskey>");
            sb.append(C68070l.C68072b.m80417g(iEmojiInfo.getAesKey()));
            sb.append("</aeskey>");
            sb.append("<cdnurl>");
            sb.append(C68070l.C68072b.m80417g(iEmojiInfo.mo62686o1()));
            sb.append("</cdnurl>");
            sb.append("<encrypturl>");
            sb.append(C68070l.C68072b.m80417g(iEmojiInfo.mo62660g2()));
            sb.append("</encrypturl>");
            sb.append("<externurl>");
            sb.append(C68070l.C68072b.m80417g(iEmojiInfo.mo62631C()));
            sb.append("</externurl>");
            sb.append("<externmd5>");
            sb.append(C68070l.C68072b.m80417g(iEmojiInfo.mo62644P1()));
            sb.append("</externmd5>");
            sb.append("<productid>");
            sb.append(C68070l.C68072b.m80417g(iEmojiInfo.getGroupId()));
            sb.append("</productid>");
            sb.append("<designerid>");
            sb.append(C68070l.C68072b.m80417g(iEmojiInfo.mo62685o0()));
            sb.append("</designerid>");
            sb.append("<attachedtext>");
            sb.append(C68070l.C68072b.m80417g(iEmojiInfo.mo62646T()));
            sb.append("</attachedtext>");
            sb.append("</emoji>");
        }
    }
}
