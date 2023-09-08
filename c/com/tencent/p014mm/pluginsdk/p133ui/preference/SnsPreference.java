package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RecentlySnsMediaObjEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.QDisFadeImageView;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96983o3;
import eb0.C75592q0;
import eb0.C97625j3;
import java.util.LinkedList;
import java.util.List;
import jr2.C99019x;
import kg3.C76577a;
import p206nj.C88955f;
import pj3.C77101h;
import te3.C101804kv2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.SnsPreference */
public final class SnsPreference extends Preference implements C77101h {

    /* renamed from: J */
    public String f283664J;

    /* renamed from: K */
    public QDisFadeImageView f283665K;

    /* renamed from: L */
    public QDisFadeImageView f283666L;

    /* renamed from: M */
    public QDisFadeImageView f283667M;

    /* renamed from: N */
    public QDisFadeImageView f283668N;

    /* renamed from: P */
    public ImageView f283669P;

    /* renamed from: Q */
    public ImageView f283670Q;

    /* renamed from: R */
    public ImageView f283671R;

    /* renamed from: S */
    public ImageView f283672S;

    /* renamed from: T */
    public C96983o3 f283673T;

    /* renamed from: U */
    public int f283674U;

    /* renamed from: V */
    public MMActivity f283675V;

    /* renamed from: W */
    public List<C101804kv2> f283676W;

    /* renamed from: X */
    public C96821b f283677X;

    /* renamed from: Y */
    public View f283678Y;

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.SnsPreference$a */
    public class C96819a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f283679d;

        /* renamed from: com.tencent.mm.pluginsdk.ui.preference.SnsPreference$a$a */
        public class C96820a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ LinkedList f283681d;

            public C96820a(LinkedList linkedList) {
                this.f283681d = linkedList;
            }

            public void run() {
                ((LinkedList) SnsPreference.this.f283676W).clear();
                ((LinkedList) SnsPreference.this.f283676W).addAll(this.f283681d);
                SnsPreference snsPreference = SnsPreference.this;
                snsPreference.mo135116I(snsPreference.f283676W);
            }
        }

        public C96819a(String str) {
            this.f283679d = str;
        }

        public void run() {
            RecentlySnsMediaObjEvent recentlySnsMediaObjEvent = new RecentlySnsMediaObjEvent();
            recentlySnsMediaObjEvent.f265008d.f265010a = this.f283679d;
            recentlySnsMediaObjEvent.publish();
            LinkedList linkedList = new LinkedList();
            C101804kv2 kv22 = recentlySnsMediaObjEvent.f265009e.f265011a;
            if (kv22 != null) {
                linkedList.add(kv22);
            }
            C101804kv2 kv23 = recentlySnsMediaObjEvent.f265009e.f265012b;
            if (kv23 != null) {
                linkedList.add(kv23);
            }
            C101804kv2 kv24 = recentlySnsMediaObjEvent.f265009e.f265013c;
            if (kv24 != null) {
                linkedList.add(kv24);
            }
            C101804kv2 kv25 = recentlySnsMediaObjEvent.f265009e.f265014d;
            if (kv25 != null) {
                linkedList.add(kv25);
            }
            SnsPreference.this.f283675V.runOnUiThread(new C96820a(linkedList));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.SnsPreference$b */
    public static class C96821b extends ColorDrawable {
        public C96821b() {
            super(-7829368);
        }
    }

    public SnsPreference(Context context) {
        this(context, (AttributeSet) null);
        this.f283675V = (MMActivity) context;
    }

    /* renamed from: I */
    public void mo135116I(List<C101804kv2> list) {
        QDisFadeImageView qDisFadeImageView = this.f283665K;
        if (qDisFadeImageView != null) {
            qDisFadeImageView.setImageResource(C0966R.color.al6);
            this.f283665K.setVisibility(4);
        }
        QDisFadeImageView qDisFadeImageView2 = this.f283666L;
        if (qDisFadeImageView2 != null) {
            qDisFadeImageView2.setImageResource(C0966R.color.al6);
            this.f283666L.setVisibility(4);
        }
        QDisFadeImageView qDisFadeImageView3 = this.f283667M;
        if (qDisFadeImageView3 != null) {
            qDisFadeImageView3.setImageResource(C0966R.color.al6);
            this.f283667M.setVisibility(4);
        }
        QDisFadeImageView qDisFadeImageView4 = this.f283668N;
        if (qDisFadeImageView4 != null) {
            qDisFadeImageView4.setImageResource(C0966R.color.al6);
            this.f283668N.setVisibility(4);
        }
        int i = 8;
        if (this.f283665K != null && list.size() >= 1) {
            this.f283665K.setVisibility(0);
            if (!C88955f.m111058b()) {
                this.f283665K.setImageResource(C0966R.C0969drawable.bir);
                this.f283669P.setVisibility(8);
            } else {
                ((C94901o) C99019x.m128972d()).mo131105Y(list.get(0), this.f283665K, this.f283675V.hashCode(), this.f283673T);
                this.f283669P.setVisibility(list.get(0).f298690e == 6 ? 0 : 8);
            }
        }
        if (this.f283666L != null && list.size() >= 2) {
            this.f283666L.setVisibility(0);
            if (!C88955f.m111058b()) {
                this.f283666L.setImageResource(C0966R.C0969drawable.bir);
            } else {
                ((C94901o) C99019x.m128972d()).mo131105Y(list.get(1), this.f283666L, this.f283675V.hashCode(), this.f283673T);
                this.f283670Q.setVisibility(list.get(1).f298690e == 6 ? 0 : 8);
            }
        }
        if (this.f283667M != null && list.size() >= 3) {
            this.f283667M.setVisibility(0);
            if (!C88955f.m111058b()) {
                this.f283667M.setImageResource(C0966R.C0969drawable.bir);
            } else {
                ((C94901o) C99019x.m128972d()).mo131105Y(list.get(2), this.f283667M, this.f283675V.hashCode(), this.f283673T);
                this.f283671R.setVisibility(list.get(2).f298690e == 6 ? 0 : 8);
            }
        }
        if (this.f283668N != null && list.size() >= 4) {
            this.f283668N.setVisibility(0);
            if (!C88955f.m111058b()) {
                this.f283668N.setImageResource(C0966R.C0969drawable.bir);
                return;
            }
            ((C94901o) C99019x.m128972d()).mo131105Y(list.get(3), this.f283668N, this.f283675V.hashCode(), this.f283673T);
            ImageView imageView = this.f283672S;
            if (list.get(3).f298690e == 6) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public int mo107418a() {
        List<C101804kv2> list = this.f283676W;
        if (list != null) {
            return ((LinkedList) list).size();
        }
        return 0;
    }

    /* renamed from: b */
    public void mo107419b(String str) {
        if (str != null) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                this.f283673T = C96983o3.f284135g;
            } else if (str.equals(C75592q0.m90789s())) {
                this.f283673T = C96983o3.f284135g;
            } else {
                this.f283673T = C96983o3.f284136h;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C96819a(str));
        }
    }

    public boolean onDetach() {
        return true;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        QDisFadeImageView qDisFadeImageView = (QDisFadeImageView) view.findViewById(C0966R.C0970id.f4l);
        this.f283665K = qDisFadeImageView;
        qDisFadeImageView.setAlpha(this.f283674U);
        this.f283665K.setImageDrawable(this.f283677X);
        QDisFadeImageView qDisFadeImageView2 = (QDisFadeImageView) view.findViewById(C0966R.C0970id.f4m);
        this.f283666L = qDisFadeImageView2;
        qDisFadeImageView2.setAlpha(this.f283674U);
        this.f283666L.setImageDrawable(this.f283677X);
        QDisFadeImageView qDisFadeImageView3 = (QDisFadeImageView) view.findViewById(C0966R.C0970id.f4n);
        this.f283667M = qDisFadeImageView3;
        qDisFadeImageView3.setAlpha(this.f283674U);
        this.f283667M.setImageDrawable(this.f283677X);
        QDisFadeImageView qDisFadeImageView4 = (QDisFadeImageView) view.findViewById(C0966R.C0970id.f4o);
        this.f283668N = qDisFadeImageView4;
        qDisFadeImageView4.setAlpha(this.f283674U);
        this.f283668N.setImageDrawable(this.f283677X);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.f5772o8);
        if (!Util.isNullOrNil(this.f283664J)) {
            textView.setText(this.f283664J);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(this.f121274d, C0966R.dimen.f3815f9);
            textView.setLayoutParams(layoutParams);
        }
        this.f283669P = (ImageView) view.findViewById(C0966R.C0970id.jvr);
        this.f283670Q = (ImageView) view.findViewById(C0966R.C0970id.jvs);
        this.f283671R = (ImageView) view.findViewById(C0966R.C0970id.jvt);
        this.f283672S = (ImageView) view.findViewById(C0966R.C0970id.jvu);
        this.f283669P.setVisibility(8);
        this.f283670Q.setVisibility(8);
        this.f283671R.setVisibility(8);
        this.f283672S.setVisibility(8);
        mo135116I(this.f283676W);
        List<C101804kv2> list = this.f283676W;
        if (list != null) {
            String string = this.f121274d.getString(C0966R.string.f361147ho3, new Object[]{Integer.valueOf(((LinkedList) list).size())});
            if (this.f283664J != null) {
                view.setContentDescription(this.f283664J + string);
                return;
            }
            view.setContentDescription(string);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f283678Y == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdc, viewGroup2);
            this.f283678Y = x;
        }
        return this.f283678Y;
    }

    public SnsPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f283675V = (MMActivity) context;
    }

    public SnsPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f283664J = "";
        this.f283665K = null;
        this.f283666L = null;
        this.f283667M = null;
        this.f283668N = null;
        this.f283669P = null;
        this.f283670Q = null;
        this.f283671R = null;
        this.f283672S = null;
        this.f283674U = 255;
        this.f283676W = new LinkedList();
        this.f283677X = new C96821b();
        this.f283675V = (MMActivity) context;
        this.f283664J = context.getString(C0966R.string.f360304br0);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
