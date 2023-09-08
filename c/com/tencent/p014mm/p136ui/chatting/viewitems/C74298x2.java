package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import ke3.C88144b;
import lg3.C76695c;
import uk3.C78222a;
import zj3.C79341b1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.x2 */
public class C74298x2 extends C73684f2 {

    /* renamed from: f */
    public CharacterStyle f218215f = new ForegroundColorSpan(MMApplicationContext.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.x2$a */
    public class C74299a implements C79341b1.C79342a {

        /* renamed from: a */
        public final /* synthetic */ View f218216a;

        /* renamed from: b */
        public final /* synthetic */ CharSequence f218217b;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.x2$a$a */
        public class C74300a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Long f218219d;

            /* renamed from: e */
            public final /* synthetic */ int f218220e;

            public C74300a(Long l, int i) {
                this.f218219d = l;
                this.f218220e = i;
            }

            public void run() {
                if (((Long) C74299a.this.f218216a.getTag(C0966R.C0970id.f357682b73)).longValue() == this.f218219d.longValue() && this.f218220e < C74299a.this.f218217b.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    CharSequence charSequence = C74299a.this.f218217b;
                    SpannableStringBuilder append = spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length()));
                    C74299a aVar = C74299a.this;
                    append.setSpan(C74298x2.this.f218215f, this.f218220e, aVar.f218217b.length(), 33);
                    View view = C74299a.this.f218216a;
                    if (view instanceof MMNeat7extView) {
                        ((MMNeat7extView) view).mo104279b(spannableStringBuilder);
                    }
                }
            }
        }

        public C74299a(View view, CharSequence charSequence) {
            this.f218216a = view;
            this.f218217b = charSequence;
        }

        /* renamed from: a */
        public void mo103136a(int i, Long l) {
            MMHandlerThread.postToMainThread(new C74300a(l, i));
        }
    }

    public C74298x2(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        boolean z;
        Class cls = C79341b1.class;
        C74243t8 t8Var = (C74243t8) view.getTag();
        if (f4Var.mo100988a4()) {
            if (this.f216339d != null) {
                Intent intent = new Intent();
                intent.addFlags(67108864);
                intent.putExtra("enter_from_scene", 3);
                C88144b.m109791i(this.f216339d.mo91565f(), "shake", ".ui.ShakeReportUI", intent, (Bundle) null);
            }
        } else if (f4Var.mo100993e4() && (view instanceof MMTextView)) {
            C78222a a = C78222a.m94508a();
            CharSequence text = ((MMTextView) view).getText();
            C72963f4 f4Var2 = t8Var.f212238a;
            a.getClass();
            C78222a.m94509b(text, f4Var2, 1);
        }
        if (C76695c.m92341b() && C76695c.m92343d() && ((z = view instanceof MMNeat7extView))) {
            MMNeat7extView mMNeat7extView = (MMNeat7extView) view;
            CharSequence a2 = mMNeat7extView.mo154968a();
            if (f4Var.mo108769t2() == 1) {
                this.f218215f = new ForegroundColorSpan(MMApplicationContext.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
            } else {
                this.f218215f = new ForegroundColorSpan(MMApplicationContext.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
            }
            Long valueOf = Long.valueOf(f4Var.getMsgId());
            if (((C79341b1) bVar.f193278b.mo102812a(cls)).mo26169i3() == valueOf.longValue() || ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26163T4() == valueOf.longValue()) {
                Log.m105918d("MicroMsg.EmojiClickListener", "speechPlaying stop!!");
                ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26161K5(bVar);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(a2.subSequence(0, a2.length())).setSpan(this.f218215f, 0, a2.length(), 33);
            if (z) {
                mMNeat7extView.mo104279b(spannableStringBuilder);
            }
            ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26171w(bVar, f4Var, a2);
            ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26159G2(new C74299a(view, a2));
        }
    }
}
