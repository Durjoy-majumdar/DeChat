package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import la2.C99358f;
import ma2.C61453s;
import ma2.C99812l0;
import ma2.C99814o0;
import ma2.C99821w;
import nj3.C47265d;
import q90.C101062d;
import qa2.C101083d;
import ra2.C101365a;
import ra2.C101366b;
import ua2.C101991b;

/* renamed from: com.tencent.mm.plugin.music.ui.l */
public class C94243l extends C47265d implements C99821w.C34529b {

    /* renamed from: g */
    public final int f272275g = C76577a.m92151b(MMApplicationContext.getContext(), 26);

    /* renamed from: h */
    public final int f272276h = C76577a.m92151b(MMApplicationContext.getContext(), 260);

    /* renamed from: i */
    public int f272277i;

    /* renamed from: j */
    public HashMap<Integer, View> f272278j = new HashMap<>();

    /* renamed from: n */
    public C99821w f272279n;

    /* renamed from: o */
    public int f272280o;

    /* renamed from: p */
    public int f272281p;

    /* renamed from: q */
    public boolean f272282q;

    /* renamed from: r */
    public MMHandler f272283r = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.music.ui.l$a */
    public class C94244a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f272284d;

        /* renamed from: e */
        public final /* synthetic */ long f272285e;

        public C94244a(int i, long j) {
            this.f272284d = i;
            this.f272285e = j;
        }

        public void run() {
            View view = C94243l.this.f272278j.get(Integer.valueOf(this.f272284d));
            if (view != null) {
                ((C94245b) view.getTag()).f272295i.setCurrentTime(this.f272285e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.l$b */
    public class C94245b {

        /* renamed from: a */
        public C101365a f272287a;

        /* renamed from: b */
        public MusicItemLayout f272288b;

        /* renamed from: c */
        public View f272289c;

        /* renamed from: d */
        public View f272290d;

        /* renamed from: e */
        public View f272291e;

        /* renamed from: f */
        public CdnImageView f272292f;

        /* renamed from: g */
        public TextView f272293g;

        /* renamed from: h */
        public TextView f272294h;

        /* renamed from: i */
        public LyricView f272295i;

        /* renamed from: j */
        public int f272296j = 1;

        /* renamed from: k */
        public boolean f272297k;

        /* renamed from: l */
        public Animation.AnimationListener f272298l = new C94246a();

        /* renamed from: com.tencent.mm.plugin.music.ui.l$b$a */
        public class C94246a implements Animation.AnimationListener {
            public C94246a() {
            }

            public void onAnimationEnd(Animation animation) {
                C94245b.this.f272297k = false;
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.music.ui.l$b$b */
        public class C94247b extends Animation {

            /* renamed from: d */
            public final int f272301d;

            /* renamed from: e */
            public final int f272302e;

            /* renamed from: f */
            public View f272303f;

            public C94247b(C94245b bVar, View view, int i) {
                this.f272303f = view;
                this.f272302e = i;
                this.f272301d = view.getHeight();
            }

            public void applyTransformation(float f, Transformation transformation) {
                int i = this.f272301d;
                this.f272303f.getLayoutParams().height = (int) (((float) i) + (((float) (this.f272302e - i)) * f));
                this.f272303f.requestLayout();
            }

            public void initialize(int i, int i2, int i3, int i4) {
                super.initialize(i, i2, i3, i4);
            }

            public boolean willChangeBounds() {
                return true;
            }
        }

        public C94245b() {
        }

        /* renamed from: a */
        public void mo129570a() {
            if (!this.f272297k && this.f272296j != 2) {
                C101083d.m132453b(2, C94243l.this.f272281p);
                C94243l lVar = C94243l.this;
                if (lVar.f272280o == 0) {
                    lVar.f272280o = this.f272289c.getMeasuredHeight();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C94243l.this.f272280o);
                    layoutParams.weight = 0.0f;
                    this.f272289c.setLayoutParams(layoutParams);
                }
                C101083d.f295909b = true;
                C115669n.INSTANCE.idkeyStat(285, 4, 1, false);
                this.f272296j = 2;
                this.f272297k = true;
                C94247b bVar = new C94247b(this, this.f272295i, C94243l.this.f272276h);
                bVar.setDuration(500);
                bVar.setAnimationListener(this.f272298l);
                this.f272295i.startAnimation(bVar);
            }
        }

        /* renamed from: b */
        public void mo129571b() {
            if (!this.f272297k && this.f272296j != 1) {
                C101083d.m132453b(3, C94243l.this.f272281p);
                C94243l lVar = C94243l.this;
                if (lVar.f272280o == 0) {
                    lVar.f272280o = this.f272289c.getMeasuredHeight();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C94243l.this.f272280o);
                    layoutParams.weight = 0.0f;
                    this.f272289c.setLayoutParams(layoutParams);
                }
                C101083d.f295909b = true;
                C115669n.INSTANCE.idkeyStat(285, 4, 1, false);
                this.f272296j = 1;
                this.f272297k = true;
                C94247b bVar = new C94247b(this, this.f272295i, C94243l.this.f272275g);
                bVar.setDuration(500);
                bVar.setAnimationListener(this.f272298l);
                this.f272295i.startAnimation(bVar);
            }
        }

        /* renamed from: c */
        public void mo129572c(C101365a aVar, boolean z) {
            C61453s sVar;
            if (aVar != null) {
                Log.m105925i("MicroMsg.Music.MusicMainAdapter", "updateView %s", aVar.field_songName);
                this.f272287a = aVar;
                if (Util.isNullOrNil(aVar.field_songHAlbumUrl)) {
                    ((C99358f) C101991b.m134284b(C99358f.class)).mo138814h0(aVar, C94243l.this.f272282q, true);
                }
                this.f272288b.setTag(this);
                if ((!C99812l0.m130303h(aVar) || C94243l.this.f272281p == 3) && !Util.isNullOrNil(aVar.field_songSinger)) {
                    this.f272294h.setText(aVar.field_songSinger);
                    this.f272294h.setVisibility(0);
                } else {
                    this.f272294h.setVisibility(8);
                }
                this.f272293g.setText(aVar.field_songName);
                this.f272293g.setTag(aVar.field_songName);
                LyricView lyricView = this.f272295i;
                C101366b wx02 = C99814o0.wx0();
                boolean z2 = C94243l.this.f272282q;
                if (((C101062d) wx02.f296944f).get(aVar.field_musicId) != null) {
                    sVar = (C61453s) ((C101062d) wx02.f296944f).get(aVar.field_musicId);
                } else {
                    sVar = wx02.mo140851Lo(aVar, z2, true);
                }
                lyricView.setLyricObj(sVar);
                if (!C99812l0.m130303h(aVar) || C94243l.this.f272282q) {
                    this.f272295i.setCurrentTime(1);
                }
                mo129571b();
                C94243l lVar = C94243l.this;
                lVar.f272279n.mo139177b(aVar, this.f272292f, lVar.f126887d, z, lVar.f272282q);
            }
        }
    }

    public C94243l(Context context, int i, boolean z) {
        super(context);
        C99821w wVar = new C99821w();
        this.f272279n = wVar;
        wVar.f292516b = this;
        this.f272281p = i;
        this.f272282q = z;
    }

    /* renamed from: a */
    public int mo72290a() {
        return ((C99358f) C101991b.m134284b(C99358f.class)).mo138818q0().size();
    }

    /* renamed from: b */
    public View mo72291b(View view, ViewGroup viewGroup, int i) {
        C94245b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.f126887d).inflate(C0966R.C0971layout.bii, viewGroup, false);
            bVar = new C94245b();
            bVar.f272288b = (MusicItemLayout) view.findViewById(C0966R.C0970id.h6m);
            bVar.f272293g = (TextView) view.findViewById(C0966R.C0970id.h6v);
            bVar.f272295i = (LyricView) view.findViewById(C0966R.C0970id.gjw);
            bVar.f272289c = view.findViewById(C0966R.C0970id.f5680lo);
            bVar.f272290d = view.findViewById(C0966R.C0970id.f5681lp);
            bVar.f272291e = view.findViewById(C0966R.C0970id.f5682lq);
            bVar.f272292f = (CdnImageView) view.findViewById(C0966R.C0970id.f5679ln);
            bVar.f272294h = (TextView) view.findViewById(C0966R.C0970id.h78);
            view.setTag(bVar);
        } else {
            bVar = (C94245b) view.getTag();
        }
        List<String> q0 = ((C99358f) C101991b.m134284b(C99358f.class)).mo138818q0();
        int size = (i - 100000) % q0.size();
        if (size < 0) {
            size += q0.size();
        }
        Log.m105919d("MicroMsg.Music.MusicMainAdapter", "play music index %d", Integer.valueOf(size));
        C101365a jo = C99814o0.wx0().mo140855jo(q0.get(size));
        this.f272278j.put(Integer.valueOf(i), view);
        bVar.mo129572c(jo, false);
        return view;
    }

    /* renamed from: c */
    public void mo72292c(View view, int i) {
        this.f272278j.remove(Integer.valueOf(i));
    }

    /* renamed from: d */
    public void mo129567d(C101365a aVar, int[] iArr) {
        for (Map.Entry<Integer, View> value : this.f272278j.entrySet()) {
            C94245b bVar = (C94245b) ((View) value.getValue()).getTag();
            if (bVar.f272287a.field_musicId.equals(aVar.field_musicId)) {
                Log.m105925i("MicroMsg.Music.MusicMainAdapter", "onColorReady: %s", bVar.f272287a.field_songName);
                int i = iArr[0];
                int i2 = iArr[1];
                bVar.f272288b.setBackgroundColor(i);
                bVar.f272295i.setLyricColor(i2);
                bVar.f272292f.setBackgroundColor(i);
                C94248m mVar = new C94248m(bVar, i);
                PaintDrawable paintDrawable = new PaintDrawable();
                paintDrawable.setShape(new RectShape());
                paintDrawable.setShaderFactory(mVar);
                bVar.f272290d.setBackgroundDrawable(paintDrawable);
                C94249n nVar = new C94249n(bVar, (i & 16777215) | 1426063360);
                PaintDrawable paintDrawable2 = new PaintDrawable();
                paintDrawable2.setShape(new RectShape());
                paintDrawable2.setShaderFactory(nVar);
                bVar.f272291e.setBackgroundDrawable(paintDrawable2);
                bVar.f272293g.setTextColor(i2);
                bVar.f272294h.setTextColor(i2);
                ((MusicMainUI) this.f126887d).mo129554O7(aVar);
            }
        }
    }

    /* renamed from: e */
    public void mo129568e(int i, long j) {
        MMHandlerThread.postToMainThread(new C94244a(i, j));
    }

    public int getCount() {
        return this.f272277i;
    }
}
