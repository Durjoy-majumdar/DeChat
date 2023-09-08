package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C75597w2;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C45829j;
import java.lang.ref.WeakReference;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76708i;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l4 */
public class C6805l4 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.l4$a */
    public class C6806a implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f24360a;

        /* renamed from: b */
        public final /* synthetic */ TextView f24361b;

        /* renamed from: c */
        public final /* synthetic */ Context f24362c;

        public C6806a(WeakReference weakReference, TextView textView, Context context) {
            this.f24360a = weakReference;
            this.f24361b = textView;
            this.f24362c = context;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            ImageView imageView;
            Class cls = C76979h.class;
            WeakReference weakReference = this.f24360a;
            if (weakReference != null && (imageView = (ImageView) weakReference.get()) != null) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                String str2 = (String) imageView.getTag();
                if (z1Var == null || ((int) z1Var.f108320R1) <= 0 || !(imageView.getTag() instanceof String) || !C45628s0.m50738C(str) || !Util.isEqual(str2, str)) {
                    TextView textView = this.f24361b;
                    Context context = this.f24362c;
                    textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(context, context.getResources().getString(C0966R.string.amv), this.f24361b.getTextSize()));
                    return;
                }
                C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(str);
                if (Lo == null || Util.isNullOrNil(Lo.mo93597f())) {
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(imageView, str);
                } else {
                    C45829j.m51128a(imageView, z1Var, Lo.mo93597f(), true);
                }
                this.f24361b.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f24362c, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str), this.f24361b.getTextSize()));
            }
        }
    }

    /* renamed from: a */
    public static void m7091a(Context context, C68070l.C68072b bVar, ImageView imageView, TextView textView) {
        C68097n Lo;
        Class cls = C76705f.class;
        Class cls2 = C76979h.class;
        if (context == null || bVar == null || imageView == null || textView == null) {
            Log.m105924i("MicroMsg.ChattingItemBizUtils", "param null");
            return;
        }
        if (Util.isNullOrNil(bVar.f195634v)) {
            Log.m105924i("MicroMsg.ChattingItemBizUtils", "srcUsername null");
        }
        if (C45628s0.m50738C(bVar.f195634v)) {
            ((C76705f) C86312j.m106911c(cls)).mo106822J5(imageView, bVar.f195634v);
        } else {
            ((C76705f) C86312j.m106911c(cls)).mo106822J5(imageView, " ");
            imageView.setImageResource(C0966R.C0969drawable.be5);
        }
        textView.setText(((C76979h) C86312j.m106911c(cls2)).yp0(context, "", textView.getTextSize()));
        imageView.setVisibility(0);
        textView.setVisibility(0);
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(bVar.f195634v);
        if (Util.isNullOrNil(displayName)) {
            displayName = bVar.f195634v;
        }
        imageView.setTag(bVar.f195634v);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(bVar.f195634v);
        if (!Util.isNullOrNil(bVar.f195634v) && (z1Var == null || ((int) z1Var.f108320R1) <= 0)) {
            imageView.setTag(bVar.f195634v);
            C31519v2.m39436a().mo55988e(bVar.f195634v, "", new C6806a(new WeakReference(imageView), textView, context));
        } else if (C45628s0.m50738C(bVar.f195634v)) {
            if (!z1Var.mo62927s3() && ((C76708i) C86312j.m106911c(C76708i.class)).N50(bVar.f195634v) == null && (Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(bVar.f195634v)) != null && !Util.isNullOrNil(Lo.mo93597f())) {
                C45829j.m51128a(imageView, z1Var, Lo.mo93597f(), true);
            }
            textView.setText(((C76979h) C86312j.m106911c(cls2)).yp0(context, displayName, textView.getTextSize()));
        } else {
            textView.setText(((C76979h) C86312j.m106911c(cls2)).yp0(context, context.getResources().getString(C0966R.string.amv), textView.getTextSize()));
        }
    }

    /* renamed from: b */
    public static void m7092b(TextView textView, C68070l.C68072b bVar, String str) {
        if (textView != null) {
            if (bVar == null) {
                Log.m105920e("MicroMsg.ChattingItemBizUtils", "setFriendInfo, param error");
                textView.setText("");
                return;
            }
            C68065f fVar = (C68065f) bVar.mo93555w(C68065f.class);
            if (fVar == null || fVar.f195423h != 1) {
                textView.setText("");
            } else {
                textView.setText(Util.nullAsNil(textView.getContext().getString(C0966R.string.gw8)));
            }
        }
    }

    /* renamed from: c */
    public static boolean m7093c(C68070l.C68072b bVar, C68065f fVar) {
        if (fVar == null || bVar == null || Util.isNullOrNil(bVar.f195634v) || !((C45696d) C86709a0.m107533q(C45696d.class)).B60(bVar.f195586j)) {
            return false;
        }
        return fVar.f195417b >= 0 || fVar.f195428m == 1;
    }
}
