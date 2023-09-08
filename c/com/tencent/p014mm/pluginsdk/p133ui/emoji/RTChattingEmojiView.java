package com.tencent.p014mm.pluginsdk.p133ui.emoji;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.view.AbsEmojiView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72989o2;
import di3.C86312j;
import kg3.C76577a;
import p008bq.C92279g0;
import qz1.C101328e;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView */
public class RTChattingEmojiView extends FrameLayout {

    /* renamed from: r */
    public static final /* synthetic */ int f283651r = 0;

    /* renamed from: d */
    public int f283652d = -1;

    /* renamed from: e */
    public int f283653e;

    /* renamed from: f */
    public int f283654f;

    /* renamed from: g */
    public int f283655g;

    /* renamed from: h */
    public int f283656h;

    /* renamed from: i */
    public int f283657i;

    /* renamed from: j */
    public ChattingEmojiView f283658j;

    /* renamed from: n */
    public ProgressBar f283659n;

    /* renamed from: o */
    public TextView f283660o;

    /* renamed from: p */
    public IEmojiInfo f283661p;

    /* renamed from: q */
    public boolean f283662q = true;

    /* renamed from: com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView$a */
    public class C96818a implements AbsEmojiView.C92684b {
        public C96818a() {
        }

        /* renamed from: a */
        public void mo126734a(int i) {
            if (i == 0) {
                RTChattingEmojiView rTChattingEmojiView = RTChattingEmojiView.this;
                rTChattingEmojiView.mo135110c(rTChattingEmojiView.f283662q ^ true ? 1 : 0);
            } else if (i == -1) {
                RTChattingEmojiView rTChattingEmojiView2 = RTChattingEmojiView.this;
                int i2 = RTChattingEmojiView.f283651r;
                rTChattingEmojiView2.mo135110c(3);
            } else {
                RTChattingEmojiView rTChattingEmojiView3 = RTChattingEmojiView.this;
                int i3 = RTChattingEmojiView.f283651r;
                rTChattingEmojiView3.mo135110c(2);
            }
        }
    }

    public RTChattingEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo135108a() {
        this.f283653e = getContext().getResources().getDimensionPixelSize(C0966R.dimen.a4z);
        this.f283654f = getContext().getResources().getDimensionPixelSize(C0966R.dimen.a4w);
        this.f283656h = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f357027a52);
        this.f283657i = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f357026a51);
        this.f283658j = new ChattingEmojiView(getContext(), (AttributeSet) null);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f283659n = progressBar;
        progressBar.setIndeterminateDrawable(getResources().getDrawable(C0966R.C0969drawable.an4));
        TextView textView = new TextView(getContext());
        this.f283660o = textView;
        textView.setText(C0966R.string.c7h);
        this.f283660o.setTextColor(getResources().getColor(C0966R.color.f3326o2));
        int b = C76577a.m92151b(getContext(), 32);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
        layoutParams.gravity = 17;
        addView(this.f283659n, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        addView(this.f283660o, layoutParams2);
    }

    /* renamed from: b */
    public void mo135109b(IEmojiInfo iEmojiInfo, long j, boolean z, C72989o2 o2Var) {
        Log.m105925i("MicroMsg.emoji.RTChattingEmojiView", "setEmojiInfo %s msgId %s", iEmojiInfo.mo62676i0(), Long.valueOf(j));
        this.f283661p = iEmojiInfo;
        int[] iArr = null;
        if (iEmojiInfo.mo62678k()) {
            this.f283658j.setStatus(1);
            mo135110c(2);
            ChattingEmojiView chattingEmojiView = this.f283658j;
            boolean z2 = !o2Var.f212820c;
            int i = (iEmojiInfo.getGroup() == 49 || String.valueOf(49).equals(iEmojiInfo.getGroupId())) ? C0966R.C0969drawable.jsb : (iEmojiInfo.getGroup() == 50 || String.valueOf(50).equals(iEmojiInfo.getGroupId())) ? C0966R.C0969drawable.dice : 0;
            if (iEmojiInfo.getGroup() == 49) {
                iArr = new int[]{C0966R.C0969drawable.jsb_j, C0966R.C0969drawable.jsb_s, C0966R.C0969drawable.jsb_b};
            } else if (iEmojiInfo.getGroup() == 50) {
                iArr = new int[]{C0966R.C0969drawable.dice_action_0, C0966R.C0969drawable.dice_action_1, C0966R.C0969drawable.dice_action_2, C0966R.C0969drawable.dice_action_3};
            }
            int[] iArr2 = iArr;
            String name = iEmojiInfo.getName();
            String valueOf = String.valueOf(j + iEmojiInfo.getName());
            chattingEmojiView.getClass();
            if (!Util.isNullOrNil(valueOf)) {
                chattingEmojiView.setCacheKey(valueOf);
                C101328e EH = ((C92279g0) C86312j.m106911c(C92279g0.class)).mo126016EH(valueOf, chattingEmojiView.getContext(), false, z2, z, i, iArr2, name);
                if (EH != null) {
                    EH.f296857q = z;
                    if (z2 == EH.f296856p) {
                        EH.start();
                    } else {
                        EH.f296851h = 0;
                        EH.f296859s = 0;
                        EH.f296856p = true;
                        EH.start();
                    }
                    chattingEmojiView.setImageDrawable(EH);
                    return;
                }
                Log.m105920e("MicroMsg.GIF.MMGIFImageView", "can not get drawable.");
                return;
            }
            boolean z3 = z;
            C101328e eVar = new C101328e(chattingEmojiView.getContext(), false, z2, z, i, iArr2, name);
            eVar.start();
            chattingEmojiView.setImageDrawable(eVar);
            return;
        }
        long j2 = j;
        this.f283662q = true;
        this.f283658j.setStatusListener(new C96818a());
        ChattingEmojiView chattingEmojiView2 = this.f283658j;
        chattingEmojiView2.f283642t = this.f283661p;
        chattingEmojiView2.f283643u = String.valueOf(j);
        chattingEmojiView2.setImageDrawable((Drawable) null);
        chattingEmojiView2.mo135097y();
    }

    /* renamed from: c */
    public final void mo135110c(int i) {
        this.f283652d = i;
        if (i == 0) {
            this.f283659n.setVisibility(0);
            this.f283660o.setVisibility(4);
            this.f283658j.setVisibility(4);
            setBackgroundResource(C0966R.C0969drawable.ayq);
        } else if (i == 1) {
            this.f283659n.setVisibility(0);
            this.f283660o.setVisibility(4);
            this.f283658j.setVisibility(4);
            setBackgroundResource(C0966R.C0969drawable.f4776mm);
        } else if (i == 2) {
            this.f283658j.setVisibility(0);
            this.f283659n.setVisibility(4);
            this.f283660o.setVisibility(4);
            setBackgroundResource(C0966R.C0969drawable.ayq);
        } else if (i == 3) {
            Drawable drawable = getResources().getDrawable(C0966R.C0969drawable.emoji_download_icon_samll);
            int i2 = this.f283655g;
            drawable.setBounds(0, 0, i2, i2);
            Log.m105919d("MicroMsg.emoji.RTChattingEmojiView", "iconSize:%d hashcode:%d", Integer.valueOf(this.f283655g), Integer.valueOf(hashCode()));
            this.f283660o.setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            this.f283660o.setText(C0966R.string.c7h);
            this.f283660o.setVisibility(0);
            this.f283659n.setVisibility(4);
            this.f283658j.setVisibility(4);
            setBackgroundResource(C0966R.C0969drawable.f4776mm);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f283652d;
        if (i3 == 0 || i3 == 1 || i3 == 3) {
            IEmojiInfo iEmojiInfo = this.f283661p;
            int max = (iEmojiInfo == null || iEmojiInfo.getHeight() == 0) ? this.f283653e : Math.max((int) (((float) this.f283661p.getHeight()) * this.f283658j.getEmojiDensityScale()), this.f283654f);
            int i4 = this.f283653e;
            if (max > i4) {
                max = i4;
            }
            int i5 = this.f283656h;
            this.f283655g = i5;
            int i6 = this.f283654f;
            if (max >= i6) {
                int i7 = this.f283657i;
                if (max < (i5 - i7) + i6) {
                    this.f283655g = i7 + (max - i6);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean performClick() {
        Log.m105925i("MicroMsg.emoji.RTChattingEmojiView", "performClick: %s", Integer.valueOf(this.f283652d));
        int i = this.f283652d;
        if (i == 3) {
            this.f283662q = false;
            this.f283658j.mo135097y();
            return true;
        } else if (i == 2) {
            return super.performClick();
        } else {
            Log.m105918d("MicroMsg.emoji.RTChattingEmojiView", "do nothing when loading");
            return true;
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        mo135110c(2);
        if (this.f283658j != null && bitmap != null && !bitmap.isRecycled()) {
            bitmap.setDensity(this.f283658j.getEmojiDensity());
            this.f283658j.setImageBitmap(bitmap);
        }
    }

    public RTChattingEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
