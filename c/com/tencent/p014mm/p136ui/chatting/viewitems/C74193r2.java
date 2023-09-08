package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.AnimImageView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.album.view.ChattingAlbumContainer;
import com.tencent.p014mm.storage.C72963f4;
import de3.C107029o;
import de3.C75355a0;
import kg3.C76577a;
import lg3.C88494d;
import uo3.C78253a;
import xo3.C78950d;
import zj3.C79341b1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.r2 */
public final class C74193r2 extends C74023i.C74026c {

    /* renamed from: b */
    public MMNeat7extView f217787b;

    /* renamed from: c */
    public TextView f217788c;

    /* renamed from: d */
    public TextView f217789d;

    /* renamed from: e */
    public ImageView f217790e;

    /* renamed from: f */
    public ImageView f217791f;

    /* renamed from: g */
    public FrameLayout f217792g;

    /* renamed from: h */
    public AnimImageView f217793h;

    /* renamed from: i */
    public ProgressBar f217794i;

    /* renamed from: j */
    public C78253a f217795j;

    /* renamed from: k */
    public C78950d f217796k;

    /* renamed from: l */
    public C107029o f217797l;

    /* renamed from: m */
    public View f217798m;

    /* renamed from: n */
    public ViewStub f217799n;

    /* renamed from: o */
    public ChattingItemTranslate f217800o;

    /* renamed from: p */
    public View f217801p;

    /* renamed from: q */
    public ChattingAlbumContainer f217802q;

    /* renamed from: b */
    public static void m88426b(C72963f4 f4Var, C74193r2 r2Var, C67391b bVar, Boolean bool) {
        Class cls = C79341b1.class;
        if (r2Var != null) {
            if (f4Var.getMsgId() == ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26163T4()) {
                r2Var.f217794i.setVisibility(0);
                if (bool.booleanValue()) {
                    r2Var.f217787b.setBackgroundResource(C0966R.C0969drawable.cbg);
                } else {
                    r2Var.f217787b.setBackgroundResource(C0966R.C0969drawable.bya);
                }
            } else {
                r2Var.f217794i.setVisibility(8);
                if (bool.booleanValue()) {
                    r2Var.f217787b.setBackgroundResource(C0966R.C0969drawable.f4750ls);
                } else {
                    r2Var.f217787b.setBackgroundResource(C0966R.C0969drawable.f4811nk);
                }
            }
            if (f4Var.getMsgId() == ((C79341b1) bVar.f193278b.mo102812a(cls)).mo26169i3()) {
                r2Var.f217793h.setVisibility(0);
                r2Var.f217793h.mo101601b();
                return;
            }
            r2Var.f217793h.setVisibility(8);
            r2Var.f217793h.mo101602c();
        }
    }

    /* renamed from: a */
    public C74193r2 mo103226a(View view, boolean z) {
        super.create(view);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) view.findViewById(C0966R.C0970id.b4b);
        this.f217787b = mMNeat7extView;
        mMNeat7extView.setMaxWidth((int) (((float) C76577a.m92155f(mMNeat7extView.getContext(), C0966R.dimen.f4284yo)) / C88494d.f255615g));
        this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.b8v);
        this.f217788c = (TextView) view.findViewById(C0966R.C0970id.b3g);
        this.f217792g = (FrameLayout) view.findViewById(C0966R.C0970id.h25);
        this.f217790e = (ImageView) view.findViewById(C0966R.C0970id.h26);
        this.f217791f = (ImageView) view.findViewById(C0966R.C0970id.h2_);
        this.f217789d = (TextView) view.findViewById(C0966R.C0970id.b2v);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.clickArea = view.findViewById(C0966R.C0970id.ib7);
        this.f217801p = view.findViewById(C0966R.C0970id.ib8);
        this.f217798m = view.findViewById(C0966R.C0970id.b4_);
        this.f217799n = (ViewStub) view.findViewById(C0966R.C0970id.f359418ku0);
        this.f217797l = new C107029o(this.f217787b, new C75355a0(this.f217787b.getContext()));
        AnimImageView animImageView = (AnimImageView) view.findViewById(C0966R.C0970id.fn9);
        this.f217793h = animImageView;
        animImageView.setType(3);
        if (z) {
            this.f217793h.setFromVoice(true);
        } else {
            this.f217793h.setFromVoice(false);
        }
        this.f217794i = (ProgressBar) view.findViewById(C0966R.C0970id.mjd);
        if (this.f217802q == null) {
            this.f217802q = new ChattingAlbumContainer(this.convertView.getContext(), C76577a.m92151b(this.convertView.getContext(), 32), C76577a.m92151b(this.convertView.getContext(), 1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C76577a.m92151b(this.convertView.getContext(), 32), C76577a.m92151b(this.convertView.getContext(), 32));
            layoutParams.gravity = 16;
            this.f217792g.addView(this.f217802q, 0, layoutParams);
            this.f217792g.setVisibility(8);
        }
        return this;
    }

    public View getMainContainerView() {
        return this.f217787b;
    }
}
