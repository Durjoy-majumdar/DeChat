package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.PlaySoundNew;
import di3.C86312j;
import p331dj.C97481g;
import p492dn.C107054l;
import p645pj.C77091b;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.q5 */
public class C115591q5 {

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.q5$a */
    public enum C69674a {
        NOTSET
    }

    /* renamed from: a */
    public static void m162472a(Context context, int i) {
        Context context2 = context;
        C69674a aVar = C69674a.NOTSET;
        if (context2 == null) {
            int i2 = i;
            Log.m105921e("MicroMsg.LuckySoundUtil", "play Err context:%s pathId:%d speekeron:%s looping:%b", context2, Integer.valueOf(i), aVar, Boolean.FALSE);
        } else if (((C107054l) C86312j.m106911c(C107054l.class)).mo157471n()) {
            Log.m105924i("MicroMsg.LuckySoundUtil", "do not play: system is mute");
        } else if (!C77091b.m93034p() || !C77091b.m93020b()) {
        } else {
            if (PlaySound.isEnablePlaySoundNew) {
                PlaySoundNew.play(context2, i, PlaySoundNew.SPEAKERON.NOTSET, false, (PlaySoundNew.OnPlayCompletionListener) null);
                return;
            }
            int i3 = i;
            String string = context.getString(i);
            C97481g gVar = new C97481g();
            Log.m105925i("MicroMsg.LuckySoundUtil", "play start mp:%d path:%s context:%s pathId:%d speakerOn:%s looping:%b ", Integer.valueOf(gVar.hashCode()), string, context2, Integer.valueOf(i), aVar, Boolean.FALSE);
            try {
                AssetFileDescriptor openFd = context.getAssets().openFd(string);
                C97481g gVar2 = gVar;
                gVar.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                openFd.close();
                gVar2.setLooping(false);
                gVar2.prepare();
                gVar2.start();
                gVar2.setOnErrorListener(new C94188o5());
                gVar2.setOnCompletionListener(new C94189p5(string));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.LuckySoundUtil", "play failed pathId:%d e:%s", Integer.valueOf(i), e.getMessage());
                Log.printErrStackTrace("MicroMsg.LuckySoundUtil", e, "", new Object[0]);
            }
        }
    }
}
