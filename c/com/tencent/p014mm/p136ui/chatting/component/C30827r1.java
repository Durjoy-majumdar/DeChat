package com.tencent.p014mm.p136ui.chatting.component;

import ck3.C67391b;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import p207nl.C100130h;
import qo3.C89779i0;
import v61.C37682c;

/* renamed from: com.tencent.mm.ui.chatting.component.r1 */
public class C30827r1 implements C100130h.C100131a {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f82838a;

    /* renamed from: b */
    public final /* synthetic */ C67391b f82839b;

    /* renamed from: c */
    public final /* synthetic */ EmojiInfo f82840c;

    public C30827r1(C89779i0 i0Var, C67391b bVar, EmojiInfo emojiInfo) {
        this.f82838a = i0Var;
        this.f82839b = bVar;
        this.f82840c = emojiInfo;
    }

    /* renamed from: a */
    public void mo57745a(boolean z) {
        this.f82838a.dismiss();
        if (z) {
            C37682c.m41479b(this.f82839b.mo91565f(), 6, this.f82840c.getMd5(), this.f82839b.mo91577r());
        }
    }
}
