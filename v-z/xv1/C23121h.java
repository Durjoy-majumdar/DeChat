package xv1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C68987c;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import pv1.C22019b;

/* renamed from: xv1.h */
public class C23121h extends C22019b {

    /* renamed from: p */
    public CharSequence f66419p;

    /* renamed from: q */
    public C23124c f66420q = new C23124c((C23122a) null);

    /* renamed from: r */
    public C23123b f66421r = new C23123b(this, (C23122a) null);

    /* renamed from: xv1.h$b */
    public class C23123b extends C22019b.C22020a {

        /* renamed from: a */
        public TextView f66422a;

        public C23123b(C23121h hVar, C23122a aVar) {
            super(hVar);
        }
    }

    /* renamed from: xv1.h$c */
    public class C23124c extends C22019b.C22021b {
        public C23124c(C23122a aVar) {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C93938f0.m118693a(C23121h.this.f66419p, ((C23123b) aVar).f66422a);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.asx, viewGroup, false);
            C23123b bVar = C23121h.this.f66421r;
            bVar.f66422a = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            inflate.setTag(bVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            Intent intent = new Intent();
            intent.putExtra("query_phrase_list", Util.stringsToList(C23121h.this.f62327e.f292122c));
            intent.putExtra("go_to_chatroom_direct", true);
            intent.putExtra("scene_from", 3);
            C88144b.m109801s(context, ".ui.transmit.MMCreateChatroomUI", intent, (Bundle) null);
            return true;
        }
    }

    public C23121h(int i) {
        super(10, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (String str : this.f62327e.f292122c) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(C68987c.f198231a), 0, str.length(), 33);
            spannableStringBuilder.append(spannableString);
            spannableStringBuilder.append("、");
        }
        this.f66419p = TextUtils.concat(new CharSequence[]{context.getString(C0966R.string.ijh), spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1), context.getString(C0966R.string.ijg)});
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f66420q;
    }
}
