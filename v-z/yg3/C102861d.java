package yg3;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import p171il.C98711d;
import p813fl.C97904g;
import p813fl.C97927q0;

/* renamed from: yg3.d */
public final class C102861d extends C98711d {
    public C102861d(int i) {
        super(i);
    }

    /* renamed from: c */
    public void mo127711c(View view, Context context, int i, C97927q0 q0Var) {
        C87412m.m108594g(context, "context");
        if (q0Var != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onClick: ");
            sb.append(i);
            sb.append(", ");
            C97904g gVar = (C97904g) q0Var;
            sb.append(gVar.f287200b.getMd5());
            Log.m105924i("MicroMsg.SimilarEmoji", sb.toString());
            if (gVar.f287201c == 103) {
                C115669n.INSTANCE.mo175912v(1257, 5);
                IEmojiInfo iEmojiInfo = gVar.f287200b;
                if (C30790w2.m39221h().mo57717d().mo142044TO(iEmojiInfo.getMd5()) == null) {
                    C30790w2.m39221h().mo57717d().insert((EmojiInfo) iEmojiInfo);
                }
            }
        }
    }
}
