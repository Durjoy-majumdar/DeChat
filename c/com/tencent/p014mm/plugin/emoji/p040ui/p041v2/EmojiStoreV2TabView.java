package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmojiStoreExptChangeEvent;
import com.tencent.p014mm.p136ui.MMTabView;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView */
public class EmojiStoreV2TabView extends RelativeLayout {

    /* renamed from: d */
    public int f110616d;

    /* renamed from: e */
    public int f110617e = 0;

    /* renamed from: f */
    public Bitmap f110618f;

    /* renamed from: g */
    public LinearLayout f110619g;

    /* renamed from: h */
    public ImageView f110620h;

    /* renamed from: i */
    public Matrix f110621i = new Matrix();

    /* renamed from: j */
    public MMTabView f110622j;

    /* renamed from: n */
    public MMTabView f110623n;

    /* renamed from: o */
    public C41070b f110624o;

    /* renamed from: p */
    public View.OnClickListener f110625p = new C41069a();

    /* renamed from: q */
    public IListener<EmojiStoreExptChangeEvent> f110626q = new IListener<EmojiStoreExptChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1836181400;
        }

        public boolean callback(IEvent iEvent) {
            EmojiStoreExptChangeEvent emojiStoreExptChangeEvent = (EmojiStoreExptChangeEvent) iEvent;
            MMHandlerThread.postToMainThread(new C41074z(this));
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView$a */
    public class C41069a implements View.OnClickListener {
        public C41069a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int intValue = ((Integer) view.getTag()).intValue();
            C41070b bVar = EmojiStoreV2TabView.this.f110624o;
            if (bVar != null) {
                EmojiStoreV2UI$$d emojiStoreV2UI$$d = (EmojiStoreV2UI$$d) bVar;
                if (intValue != emojiStoreV2UI$$d.f110644f.f110634h) {
                    emojiStoreV2UI$$d.f110642d.setCurrentItem(intValue, false);
                }
                emojiStoreV2UI$$d.f110644f.f110634h = intValue;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView$b */
    public interface C41070b {
    }

    public EmojiStoreV2TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo64122a();
    }

    /* renamed from: a */
    public final void mo64122a() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f110619g = linearLayout;
        linearLayout.setBackgroundResource(C0966R.color.al6);
        this.f110619g.setId(C0966R.C0970id.f357928ci1);
        this.f110619g.setOrientation(0);
        addView(this.f110619g, new RelativeLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(getContext());
        this.f110620h = imageView;
        imageView.setImageMatrix(this.f110621i);
        this.f110620h.setScaleType(ImageView.ScaleType.MATRIX);
        this.f110620h.setId(C0966R.C0970id.f357929ci2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C76577a.m92151b(getContext(), 3));
        layoutParams.addRule(8, C0966R.C0970id.f357928ci1);
        addView(this.f110620h, layoutParams);
        MMTabView mMTabView = new MMTabView(getContext(), 0);
        mMTabView.setTag(0);
        mMTabView.setOnClickListener(this.f110625p);
        this.f110622j = mMTabView;
        if (!Util.isNullOrNil(C41051m.m44498a().f110537e)) {
            this.f110622j.setText(C41051m.m44498a().f110537e);
        } else if (C41051m.m44498a().f110536d) {
            this.f110622j.setText((int) C0966R.string.c8t);
        } else {
            this.f110622j.setText((int) C0966R.string.c8s);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.arb));
        layoutParams2.weight = 1.0f;
        this.f110619g.addView(this.f110622j, layoutParams2);
        MMTabView mMTabView2 = new MMTabView(getContext(), 1);
        mMTabView2.setTag(1);
        mMTabView2.setOnClickListener(this.f110625p);
        this.f110623n = mMTabView2;
        mMTabView2.setText((int) C0966R.string.f360374c91);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(C0966R.dimen.arb));
        layoutParams3.weight = 1.0f;
        this.f110619g.addView(this.f110623n, layoutParams3);
    }

    public int getCurentIndex() {
        return this.f110617e;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = (i3 - i) / 2;
        this.f110616d = i5;
        Bitmap bitmap = this.f110618f;
        if ((bitmap == null || bitmap.getWidth() != i5) && i5 > 0) {
            Object[] objArr = new Object[2];
            Bitmap bitmap2 = this.f110618f;
            objArr[0] = Integer.valueOf(bitmap2 == null ? -1 : bitmap2.getWidth());
            objArr[1] = Integer.valueOf(i5);
            Log.m105929w("MicroMsg.emoji.EmojiStoreV2TabView", "sharp width changed, from %d to %d", objArr);
            this.f110618f = Bitmap.createBitmap(i5, C76577a.m92151b(getContext(), 3), Bitmap.Config.ARGB_8888);
            new Canvas(this.f110618f).drawColor(getResources().getColor(C0966R.color.akw));
            this.f110621i.setTranslate(((float) this.f110616d) * (((float) this.f110617e) + 0.0f), 0.0f);
            this.f110620h.setImageMatrix(this.f110621i);
            this.f110620h.setImageBitmap(this.f110618f);
        }
        setTo(this.f110617e);
    }

    public void setOnTabClickListener(C41070b bVar) {
        this.f110624o = bVar;
    }

    public void setPersonTabUnReadCount(String str) {
        MMTabView mMTabView = this.f110623n;
        if (mMTabView != null) {
            mMTabView.setUnread(str);
        }
    }

    public void setTo(int i) {
        this.f110617e = i;
        this.f110622j.setTextColor(i == 0 ? getResources().getColor(C0966R.color.akw) : getContext().getResources().getColor(C0966R.color.FG_0));
        this.f110623n.setTextColor(this.f110617e == 1 ? getResources().getColor(C0966R.color.akw) : getContext().getResources().getColor(C0966R.color.FG_0));
    }

    public EmojiStoreV2TabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo64122a();
    }
}
