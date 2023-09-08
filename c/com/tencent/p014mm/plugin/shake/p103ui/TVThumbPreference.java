package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import di3.C86312j;
import java.util.List;
import p755xs.C102720b;
import pj3.C47511g;
import sf0.C101594c0;
import un2.C78239b;

/* renamed from: com.tencent.mm.plugin.shake.ui.TVThumbPreference */
public class TVThumbPreference extends Preference implements C101594c0.C101595a {

    /* renamed from: J */
    public ImageView f273411J;

    /* renamed from: K */
    public ImageView f273412K;

    /* renamed from: L */
    public ImageView f273413L;

    /* renamed from: M */
    public C47511g f273414M;

    /* renamed from: N */
    public List<String> f273415N;

    /* renamed from: com.tencent.mm.plugin.shake.ui.TVThumbPreference$a */
    public class C94548a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f273416d;

        public C94548a(Bitmap bitmap) {
            this.f273416d = bitmap;
        }

        public void run() {
            TVThumbPreference.this.f273411J.setImageBitmap(this.f273416d);
            C47511g gVar = TVThumbPreference.this.f273414M;
            if (gVar != null) {
                gVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.TVThumbPreference$b */
    public class C94549b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f273418d;

        public C94549b(Bitmap bitmap) {
            this.f273418d = bitmap;
        }

        public void run() {
            TVThumbPreference.this.f273412K.setImageBitmap(this.f273418d);
            C47511g gVar = TVThumbPreference.this.f273414M;
            if (gVar != null) {
                gVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.TVThumbPreference$c */
    public class C94550c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f273420d;

        public C94550c(Bitmap bitmap) {
            this.f273420d = bitmap;
        }

        public void run() {
            TVThumbPreference.this.f273413L.setImageBitmap(this.f273420d);
            C47511g gVar = TVThumbPreference.this.f273414M;
            if (gVar != null) {
                gVar.notifyDataSetChanged();
            }
        }
    }

    public TVThumbPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f273415N = null;
        this.f121271G = C0966R.C0971layout.cay;
        this.f121272H = 0;
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (str != null && bitmap != null && !bitmap.isRecycled()) {
            ImageView imageView = this.f273411J;
            if (imageView == null || imageView.getTag() == null || !str.equals((String) this.f273411J.getTag())) {
                ImageView imageView2 = this.f273412K;
                if (imageView2 == null || imageView2.getTag() == null || !str.equals((String) this.f273412K.getTag())) {
                    ImageView imageView3 = this.f273413L;
                    if (imageView3 != null && imageView3.getTag() != null && str.equals((String) this.f273413L.getTag())) {
                        this.f273413L.post(new C94550c(bitmap));
                        return;
                    }
                    return;
                }
                this.f273412K.post(new C94549b(bitmap));
                return;
            }
            this.f273411J.post(new C94548a(bitmap));
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Class cls = C102720b.class;
        super.mo1086w(view);
        this.f273411J = (ImageView) view.findViewById(C0966R.C0970id.f359372kk2);
        this.f273412K = (ImageView) view.findViewById(C0966R.C0970id.f359373kk3);
        this.f273413L = (ImageView) view.findViewById(C0966R.C0970id.kk4);
        List<String> list = this.f273415N;
        if (list != null && list.size() > 0) {
            C78239b bVar = new C78239b(this.f273415N.get(0));
            this.f273411J.setTag(bVar.mo94820d());
            Bitmap N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(bVar);
            if (N6 != null && !N6.isRecycled()) {
                this.f273411J.setImageBitmap(N6);
            }
            this.f273411J.setVisibility(0);
            if (1 < this.f273415N.size()) {
                C78239b bVar2 = new C78239b(this.f273415N.get(1));
                this.f273412K.setTag(bVar2.mo94820d());
                Bitmap N62 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(bVar2);
                if (N62 != null && !N62.isRecycled()) {
                    this.f273412K.setImageBitmap(N62);
                }
                this.f273412K.setVisibility(0);
                if (2 < this.f273415N.size()) {
                    C78239b bVar3 = new C78239b(this.f273415N.get(2));
                    this.f273413L.setTag(bVar3.mo94820d());
                    Bitmap N63 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(bVar3);
                    if (N63 != null && !N63.isRecycled()) {
                        this.f273413L.setImageBitmap(N63);
                    }
                    this.f273413L.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        return super.mo1087x(viewGroup);
    }

    public TVThumbPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
