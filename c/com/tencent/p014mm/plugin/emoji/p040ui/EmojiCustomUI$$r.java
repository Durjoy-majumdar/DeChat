package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import m61.C99793a;
import nj3.C76879j;
import nj3.C76912y0;
import p140cw.C7138g;
import p171il.C98744t;
import p490dl.C97496s;
import p813fl.C97904g;
import p813fl.C97927q0;
import p813fl.C97938w;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$r */
public class EmojiCustomUI$$r implements C98744t {

    /* renamed from: a */
    public final /* synthetic */ EmojiCustomUI f268456a;

    public EmojiCustomUI$$r(EmojiCustomUI emojiCustomUI) {
        this.f268456a = emojiCustomUI;
    }

    /* renamed from: b */
    public void mo127710b(View view, Context context, int i, C97927q0 q0Var) {
    }

    /* renamed from: c */
    public void mo127711c(View view, Context context, int i, C97927q0 q0Var) {
        if (q0Var instanceof C97938w) {
            EmojiCustomUI emojiCustomUI = this.f268456a;
            if (1 != emojiCustomUI.f268432v) {
                if (!C86709a0.m107535s().mo121147n()) {
                    C76912y0.m92771j(emojiCustomUI, (View) null);
                    return;
                }
                if (emojiCustomUI.f268421h.mo127612b().getDataCount() >= C97496s.m125613a()) {
                    C76879j.m92749t(emojiCustomUI, emojiCustomUI.getString(C0966R.string.f360376ca0), "", new C68863v(emojiCustomUI));
                } else {
                    ((C7138g) C86312j.m106911c(C7138g.class)).fx0(emojiCustomUI, 205, (Intent) null);
                }
                C115669n.INSTANCE.mo160131h(11596, 0);
            }
        } else if (q0Var instanceof C97904g) {
            IEmojiInfo iEmojiInfo = ((C97904g) q0Var).f287200b;
            if (this.f268456a.f268431u.contains(iEmojiInfo.getMd5())) {
                EmojiCustomUI emojiCustomUI2 = this.f268456a;
                String md5 = iEmojiInfo.getMd5();
                ArrayList<String> arrayList = emojiCustomUI2.f268431u;
                if (arrayList != null) {
                    arrayList.remove(md5);
                    C99793a aVar = emojiCustomUI2.f268419f;
                    ArrayList<String> arrayList2 = emojiCustomUI2.f268431u;
                    aVar.getClass();
                    C87412m.m108594g(arrayList2, "list");
                    aVar.f292472h.clear();
                    aVar.f292472h.addAll(arrayList2);
                }
            } else {
                EmojiCustomUI emojiCustomUI3 = this.f268456a;
                String md52 = iEmojiInfo.getMd5();
                ArrayList<String> arrayList3 = emojiCustomUI3.f268431u;
                if (arrayList3 != null && !arrayList3.contains(md52)) {
                    emojiCustomUI3.f268431u.add(md52);
                    C99793a aVar2 = emojiCustomUI3.f268419f;
                    ArrayList<String> arrayList4 = emojiCustomUI3.f268431u;
                    aVar2.getClass();
                    C87412m.m108594g(arrayList4, "list");
                    aVar2.f292472h.clear();
                    aVar2.f292472h.addAll(arrayList4);
                }
            }
            this.f268456a.f268419f.notifyItemChanged(i);
            this.f268456a.mo127700J7();
        }
    }
}
