package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C21070h;
import jc0.C21210b;
import kg3.C76577a;
import p158gt.C98201k;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.x0 */
public class C74294x0 extends C74023i.C74026c {

    /* renamed from: i */
    public static final int f218199i = (((int) C76577a.m92156g(C80589e.f235760a.getApplication())) * 64);

    /* renamed from: b */
    public MMImageView f218200b;

    /* renamed from: c */
    public TextView f218201c;

    /* renamed from: d */
    public TextView f218202d;

    /* renamed from: e */
    public TextView f218203e;

    /* renamed from: f */
    public View f218204f;

    /* renamed from: g */
    public boolean f218205g;

    /* renamed from: h */
    public int f218206h = 0;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.x0$a */
    public class C74295a implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ Context f218207a;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.x0$a$a */
        public class C74296a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f218209d;

            public C74296a(Bitmap bitmap) {
                this.f218209d = bitmap;
            }

            public boolean onPreDraw() {
                C74294x0.this.f218204f.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = C74294x0.this.f218204f.getHeight();
                int width = C74294x0.this.f218204f.getWidth();
                if (height == 0) {
                    height = C76577a.m92157h(C74295a.this.f218207a, C0966R.dimen.f4282ym);
                }
                if (width == 0) {
                    width = C76577a.m92157h(C74295a.this.f218207a, C0966R.dimen.f4283yn);
                }
                C74294x0.this.f218204f.setBackgroundDrawable(new BitmapDrawable(C74294x0.this.f218205g ? BitmapUtil.createMaskImage(this.f218209d, C0966R.C0969drawable.by6, width, height) : BitmapUtil.createMaskImage(this.f218209d, C0966R.C0969drawable.byb, width, height)));
                return true;
            }
        }

        public C74295a(Context context) {
            this.f218207a = context;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Bitmap bitmap = bVar.f59988d;
            if (bitmap != null) {
                C74294x0.this.f218204f.getViewTreeObserver().addOnPreDrawListener(new C74296a(bitmap));
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.x0$b */
    public class C74297b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public boolean f218211d = false;

        /* renamed from: e */
        public final /* synthetic */ Context f218212e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f218213f;

        public C74297b(Context context, Bitmap bitmap) {
            this.f218212e = context;
            this.f218213f = bitmap;
        }

        public boolean onPreDraw() {
            if (this.f218211d) {
                C74294x0.this.f218204f.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            C74294x0.this.f218204f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f218211d = true;
            int b = C76577a.m92151b(this.f218212e, 24);
            Bitmap bitmap = this.f218213f;
            if (bitmap == null || bitmap.isRecycled()) {
                bitmap = BitmapUtil.createColorBitmap(this.f218212e.getResources().getColor(C0966R.color.f3227jy), b, b);
            }
            int height = bitmap.getHeight();
            if (b > height) {
                b = height;
            }
            Bitmap fastblur = BitmapUtil.fastblur(BitmapUtil.setContrast(Bitmap.createScaledBitmap(bitmap, b, b, true), 0.9f), 20);
            int height2 = C74294x0.this.f218204f.getHeight();
            int width = C74294x0.this.f218204f.getWidth();
            if (height2 == 0) {
                height2 = C76577a.m92157h(this.f218212e, C0966R.dimen.f4282ym);
            }
            if (width == 0) {
                width = C76577a.m92157h(this.f218212e, C0966R.dimen.f4283yn);
            }
            C74294x0.this.f218204f.setBackgroundDrawable(new BitmapDrawable(C74294x0.this.f218205g ? BitmapUtil.createMaskImage(fastblur, C0966R.C0969drawable.by6, width, height2) : BitmapUtil.createMaskImage(fastblur, C0966R.C0969drawable.byb, width, height2)));
            return true;
        }
    }

    /* renamed from: a */
    public C74294x0 mo103283a(View view, boolean z) {
        super.create(view);
        this.f218205g = z;
        this.timeTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b8z);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
        this.userTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b9_);
        this.f218200b = (MMImageView) this.convertView.findViewById(C0966R.C0970id.f6133y8);
        this.f218201c = (TextView) this.convertView.findViewById(C0966R.C0970id.f6134y9);
        this.f218202d = (TextView) this.convertView.findViewById(C0966R.C0970id.f6132y7);
        this.f218203e = (TextView) this.convertView.findViewById(C0966R.C0970id.f6130y5);
        this.f218204f = this.convertView.findViewById(C0966R.C0970id.f6131y6);
        this.f218206h = C74023i.m87886m(MMApplicationContext.getContext());
        return this;
    }

    /* renamed from: b */
    public void mo103284b(Context context, C68070l.C68072b bVar, String str, boolean z) {
        Class cls = C98201k.class;
        resetChatBubbleWidth(this.clickArea, this.f218206h);
        int i = bVar.f195582i;
        if (i == 16) {
            this.f218201c.setText(bVar.f195574g);
            this.f218202d.setText(bVar.f195528S0);
            this.f218200b.setVisibility(0);
            if (z) {
                C20828a b = C20828a.m22825b();
                String str2 = bVar.f195646y;
                MMImageView mMImageView = this.f218200b;
                C20937c.C20939b bVar2 = new C20937c.C20939b();
                int i2 = f218199i;
                bVar2.f59354j = i2;
                bVar2.f59355k = i2;
                bVar2.f59359o = C0966R.raw.app_attach_file_icon_webpage;
                bVar2.f59364t = true;
                b.mo32519h(str2, mMImageView, bVar2.mo32666a());
                return;
            }
            this.f218200b.setImageResource(C0966R.C0969drawable.bir);
        } else if (i != 34) {
            this.f218201c.setText(bVar.f195574g);
            this.f218202d.setText(bVar.f195528S0);
            this.f218200b.setVisibility(0);
            if (z) {
                C20828a b2 = C20828a.m22825b();
                String v102 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).v10(str, true);
                MMImageView mMImageView2 = this.f218200b;
                C20937c.C20939b bVar3 = new C20937c.C20939b();
                bVar3.f59353i = 1;
                int i3 = f218199i;
                bVar3.f59354j = i3;
                bVar3.f59355k = i3;
                bVar3.f59359o = C0966R.raw.app_attach_file_icon_webpage;
                bVar3.f59364t = true;
                b2.mo32519h(v102, mMImageView2, bVar3.mo32666a());
                return;
            }
            this.f218200b.setImageResource(C0966R.C0969drawable.bir);
        } else {
            String str3 = bVar.f195570f;
            if (str3 == null || str3.length() <= 0) {
                this.f218201c.setVisibility(8);
            } else {
                this.f218201c.setVisibility(0);
                this.f218201c.setText(bVar.f195570f);
                if (!Util.isNullOrNil(bVar.f195552a1)) {
                    this.f218201c.setTextColor(Util.convertStringToRGB(bVar.f195552a1, context.getResources().getColor(C0966R.color.a7f)));
                } else {
                    this.f218201c.setTextColor(context.getResources().getColor(C0966R.color.a7f));
                }
            }
            this.f218202d.setMaxLines(2);
            this.f218202d.setVisibility(0);
            this.f218202d.setText(bVar.f195574g);
            if (!Util.isNullOrNil(bVar.f195556b1)) {
                this.f218202d.setTextColor(Util.convertStringToRGB(bVar.f195556b1, context.getResources().getColor(C0966R.color.f3541x6)));
            } else {
                this.f218202d.setTextColor(context.getResources().getColor(C0966R.color.f3541x6));
            }
            if (!Util.isNullOrNil(bVar.f195540W0)) {
                this.f218203e.setText(bVar.f195540W0);
            } else {
                this.f218203e.setText(C0966R.string.b9k);
            }
            if (!z) {
                this.f218200b.setImageBitmap(BitmapFactory.decodeResource(context.getResources(), C0966R.C0969drawable.bir));
            } else if (!Util.isNullOrNil(bVar.f195549Z0)) {
                C20828a b3 = C20828a.m22825b();
                String str4 = bVar.f195646y;
                MMImageView mMImageView3 = this.f218200b;
                C20937c.C20939b bVar4 = new C20937c.C20939b();
                int i4 = f218199i;
                bVar4.f59354j = i4;
                bVar4.f59355k = i4;
                bVar4.f59359o = C0966R.raw.app_attach_file_icon_webpage;
                bVar4.f59364t = true;
                b3.mo32519h(str4, mMImageView3, bVar4.mo32666a());
                C20828a b4 = C20828a.m22825b();
                String str5 = bVar.f195549Z0;
                ImageView imageView = new ImageView(context);
                C20937c.C20939b bVar5 = new C20937c.C20939b();
                bVar5.f59346b = true;
                b4.mo32520i(str5, imageView, bVar5.mo32666a(), new C74295a(context));
            } else {
                Bitmap jo = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127188jo(str, C76577a.m92156g(context), false);
                if (jo == null || jo.isRecycled()) {
                    C20828a b5 = C20828a.m22825b();
                    String str6 = bVar.f195646y;
                    MMImageView mMImageView4 = this.f218200b;
                    C20937c.C20939b bVar6 = new C20937c.C20939b();
                    int i5 = f218199i;
                    bVar6.f59354j = i5;
                    bVar6.f59355k = i5;
                    bVar6.f59359o = C0966R.raw.app_attach_file_icon_webpage;
                    bVar6.f59364t = true;
                    b5.mo32519h(str6, mMImageView4, bVar6.mo32666a());
                } else {
                    this.f218200b.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(jo, false, (float) (jo.getWidth() / 2)));
                }
                this.f218204f.getViewTreeObserver().addOnPreDrawListener(new C74297b(context, jo));
            }
        }
    }

    public View getMainContainerView() {
        return this.convertView;
    }
}
