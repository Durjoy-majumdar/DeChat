package com.tencent.p014mm.plugin.card.p031ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.plugin.card.model.CardGiftInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import nj3.C76879j;
import nj3.C88989a;
import p755xs.C102720b;
import wz0.C78740a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.card.ui.CardGiftImageUI */
public class CardGiftImageUI extends MMActivity implements C78740a.C78742b {

    /* renamed from: d */
    public CardGiftInfo f267721d;

    /* renamed from: e */
    public String f267722e;

    /* renamed from: f */
    public ImageView f267723f;

    /* renamed from: g */
    public RelativeLayout f267724g;

    /* renamed from: h */
    public MMGestureGallery f267725h;

    /* renamed from: i */
    public ProgressBar f267726i;

    /* renamed from: j */
    public MMHandler f267727j = new MMHandler(Looper.getMainLooper());

    /* renamed from: n */
    public C45082x0 f267728n;

    /* renamed from: o */
    public Bundle f267729o;

    /* renamed from: p */
    public boolean f267730p = false;

    /* renamed from: q */
    public C45059m0 f267731q;

    /* renamed from: r */
    public int f267732r = 0;

    /* renamed from: s */
    public int f267733s = 0;

    /* renamed from: t */
    public int f267734t = 0;

    /* renamed from: u */
    public int f267735u = 0;

    /* renamed from: v */
    public C92961f f267736v;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftImageUI$a */
    public class C92955a implements MMGestureGallery.C19842g {
        public C92955a() {
        }

        /* renamed from: a */
        public void mo26370a() {
            CardGiftImageUI.this.mo127369H7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftImageUI$b */
    public class C92956b implements AdapterView.OnItemLongClickListener {
        public C92956b() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            CardGiftImageUI cardGiftImageUI = CardGiftImageUI.this;
            cardGiftImageUI.f267728n.mo70439e();
            C76879j.m92730a(cardGiftImageUI, (Dialog) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftImageUI$c */
    public class C92957c implements C45059m0.C45068i {

        /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftImageUI$c$a */
        public class C92958a implements Runnable {
            public C92958a() {
            }

            public void run() {
                CardGiftImageUI.this.finish();
                CardGiftImageUI.this.overridePendingTransition(0, 0);
            }
        }

        public C92957c() {
        }

        public void onAnimationEnd() {
            new MMHandler().post(new C92958a());
        }

        public void onAnimationStart() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftImageUI$d */
    public class C92959d implements Runnable {
        public C92959d() {
        }

        public void run() {
            if (CardGiftImageUI.this.f267726i.getVisibility() != 0) {
                CardGiftImageUI.this.f267726i.setVisibility(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftImageUI$e */
    public class C92960e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f267742d;

        public C92960e(String str) {
            this.f267742d = str;
        }

        public void run() {
            if (CardGiftImageUI.this.f267726i.getVisibility() != 8) {
                CardGiftImageUI.this.f267726i.setVisibility(8);
            }
            CardGiftImageUI cardGiftImageUI = CardGiftImageUI.this;
            cardGiftImageUI.f267722e = this.f267742d;
            cardGiftImageUI.getClass();
            C45082x0 x0Var = new C45082x0(cardGiftImageUI);
            cardGiftImageUI.f267728n = x0Var;
            x0Var.f122287f = new C92968j(cardGiftImageUI);
            x0Var.f122288g = new C92969k(cardGiftImageUI);
            CardGiftImageUI.this.f267736v.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftImageUI$f */
    public class C92961f extends BaseAdapter {
        public C92961f(C92955a aVar) {
        }

        public int getCount() {
            return 1;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            MultiTouchImageView multiTouchImageView;
            Bitmap Ou = ((C102720b) C86312j.m106911c(C102720b.class)).mo142105Ou(CardGiftImageUI.this.f267722e);
            if (Ou == null) {
                Log.m105928w("MicroMsg.CardGiftImageUI", "get image fail");
                if (view != null && !(view instanceof MultiTouchImageView)) {
                    return view;
                }
                View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.f6742na, (ViewGroup) null);
                ((ImageView) inflate.findViewById(C0966R.C0970id.f4k)).setImageResource(C0966R.raw.download_image_icon);
                inflate.setLayoutParams(new Gallery.LayoutParams(-1, -1));
                return inflate;
            }
            Context context = viewGroup.getContext();
            if (view == null || !(view instanceof MultiTouchImageView)) {
                multiTouchImageView = new MultiTouchImageView(context, Ou.getWidth(), Ou.getHeight());
            } else {
                multiTouchImageView = (MultiTouchImageView) view;
                int width = Ou.getWidth();
                int height = Ou.getHeight();
                multiTouchImageView.f348280o = width;
                multiTouchImageView.f348281p = height;
            }
            multiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            multiTouchImageView.setImageBitmap(Ou);
            multiTouchImageView.setMaxZoomDoubleTab(true);
            return multiTouchImageView;
        }
    }

    /* renamed from: H7 */
    public void mo127369H7() {
        this.f267731q.mo70410e(this.f267733s, this.f267732r, this.f267734t, this.f267735u);
        this.f267731q.mo70409d(this.f267724g, this.f267723f, new C92957c(), (C45059m0.C45066g) null);
    }

    /* renamed from: J6 */
    public void mo23387J6(String str) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        Log.m105918d("MicroMsg.CardGiftImageUI", "dispatchKeyEvent");
        mo127369H7();
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6716ml;
    }

    public void initView() {
        this.f267723f = (ImageView) findViewById(C0966R.C0970id.ehi);
        this.f267726i = (ProgressBar) findViewById(C0966R.C0970id.f4v);
        this.f267724g = (RelativeLayout) findViewById(C0966R.C0970id.f58);
        MMGestureGallery mMGestureGallery = (MMGestureGallery) findViewById(C0966R.C0970id.ehh);
        this.f267725h = mMGestureGallery;
        mMGestureGallery.setVerticalFadingEdgeEnabled(false);
        this.f267725h.setHorizontalFadingEdgeEnabled(false);
        C92961f fVar = new C92961f((C92955a) null);
        this.f267736v = fVar;
        this.f267725h.setAdapter(fVar);
        this.f267725h.setSingleClickOverListener(new C92955a());
        this.f267725h.setOnItemLongClickListener(new C92956b());
        this.f267731q = new C45059m0(this);
    }

    /* renamed from: j5 */
    public void mo23388j5(String str, String str2) {
        this.f267727j.post(new C92960e(str2));
    }

    public void onCreate(Bundle bundle) {
        if (getIntent().getExtras() != null) {
            getIntent().getExtras().setClassLoader(getClass().getClassLoader());
        }
        super.onCreate(bundle);
        hideTitleView();
        this.f267729o = bundle;
        getWindow().setFlags(1024, 1024);
        CardGiftInfo cardGiftInfo = (CardGiftInfo) getIntent().getParcelableExtra("key_gift_into");
        this.f267721d = cardGiftInfo;
        Object[] objArr = new Object[1];
        objArr[0] = cardGiftInfo == null ? "null" : cardGiftInfo.toString();
        Log.m105919d("MicroMsg.CardGiftImageUI", "cardGiftInfo:%s", objArr);
        Log.m105925i("MicroMsg.CardGiftImageUI", "imgPath:%s", this.f267722e);
        initView();
        C78740a.m95080b(this);
        CardGiftInfo cardGiftInfo2 = this.f267721d;
        if (cardGiftInfo2 == null || Util.isNullOrNil(cardGiftInfo2.f51582h)) {
            Log.m105920e("MicroMsg.CardGiftImageUI", "fromUserContentPicUrl is null");
            return;
        }
        CardGiftInfo cardGiftInfo3 = this.f267721d;
        C78740a.m95079a(cardGiftInfo3.f51582h, cardGiftInfo3.f51585n, cardGiftInfo3.f51596x, 2);
    }

    public void onDestroy() {
        super.onDestroy();
        C78740a.m95081c(this);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C92961f fVar = this.f267736v;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public void onStart() {
        Bundle bundle = this.f267729o;
        if (!this.f267730p) {
            this.f267730p = true;
            this.f267732r = getIntent().getIntExtra("img_top", 0);
            this.f267733s = getIntent().getIntExtra("img_left", 0);
            this.f267734t = getIntent().getIntExtra("img_width", 0);
            int intExtra = getIntent().getIntExtra("img_height", 0);
            this.f267735u = intExtra;
            this.f267731q.mo70410e(this.f267733s, this.f267732r, this.f267734t, intExtra);
            if (bundle == null) {
                this.f267724g.getViewTreeObserver().addOnPreDrawListener(new C92970l(this));
            }
        }
        super.onStart();
    }

    /* renamed from: q5 */
    public void mo23389q5(String str, int i, int i2) {
        this.f267727j.post(new C92959d());
    }
}
