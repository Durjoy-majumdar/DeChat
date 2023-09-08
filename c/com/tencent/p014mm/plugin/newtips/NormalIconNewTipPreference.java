package com.tencent.p014mm.plugin.newtips;

import a70.C112760b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.NormalIconPreference;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C21070h;
import java.lang.ref.WeakReference;
import p158gt.C76057w;
import p158gt.C8451i;
import p626nv.C76963d;
import pj3.C47511g;
import te3.tg4;
import u00.C52399a;

/* renamed from: com.tencent.mm.plugin.newtips.NormalIconNewTipPreference */
public class NormalIconNewTipPreference extends NormalIconPreference implements C115619a {

    /* renamed from: l1 */
    public Context f201746l1;

    /* renamed from: m1 */
    public View f201747m1;

    /* renamed from: n1 */
    public String f201748n1;

    /* renamed from: o1 */
    public String f201749o1;

    /* renamed from: p1 */
    public C21070h f201750p1;

    /* renamed from: q1 */
    public WeakReference<C47511g> f201751q1;

    /* renamed from: r1 */
    public C76057w.C76058a f201752r1;

    /* renamed from: s1 */
    public C69941b f201753s1;

    /* renamed from: t1 */
    public C76057w.C76058a f201754t1;

    /* renamed from: u1 */
    public boolean f201755u1;

    /* renamed from: com.tencent.mm.plugin.newtips.NormalIconNewTipPreference$a */
    public class C69939a implements C76057w.C76058a {

        /* renamed from: com.tencent.mm.plugin.newtips.NormalIconNewTipPreference$a$a */
        public class C69940a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f201757d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f201758e;

            public C69940a(String str, Bitmap bitmap) {
                this.f201757d = str;
                this.f201758e = bitmap;
            }

            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("download url ");
                sb.append(this.f201757d);
                sb.append(" , result ");
                sb.append(this.f201758e == null);
                Log.m105924i("MicroMsg.NewTips.NormalIconNewTipPreference", sb.toString());
                if (this.f201757d.equals(NormalIconNewTipPreference.this.f201749o1)) {
                    NormalIconNewTipPreference.this.mo101930L(this.f201758e);
                    NormalIconNewTipPreference normalIconNewTipPreference = NormalIconNewTipPreference.this;
                    normalIconNewTipPreference.f201749o1 = null;
                    normalIconNewTipPreference.mo96253d0();
                }
            }
        }

        public C69939a() {
        }

        /* renamed from: a */
        public void mo25933a(String str, Bitmap bitmap, String str2) {
            MMHandlerThread.postToMainThread(new C69940a(str, (!NormalIconNewTipPreference.this.f201755u1 || bitmap == null || bitmap.isRecycled()) ? BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.1f) : BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) (bitmap.getWidth() / 2))));
        }
    }

    /* renamed from: com.tencent.mm.plugin.newtips.NormalIconNewTipPreference$b */
    public interface C69941b {
        /* renamed from: a */
        void mo25932a(String str);
    }

    public NormalIconNewTipPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b0 */
    public final void mo96251b0(String str) {
        int dimensionPixelOffset = this.f201746l1.getResources().getDimensionPixelOffset(C0966R.dimen.f4216wh);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59351g = C112760b.m154195C();
        bVar.f59346b = true;
        bVar.f59364t = true;
        bVar.f59345a = true;
        bVar.f59355k = dimensionPixelOffset;
        bVar.f59354j = dimensionPixelOffset;
        C20828a.m22825b().mo32520i(str, this.f215051L, bVar.mo32666a(), this.f201750p1);
    }

    /* renamed from: c0 */
    public void mo96252c0() {
        ((C76963d) C86312j.m106911c(C76963d.class)).mo107038o0(this);
    }

    /* renamed from: d0 */
    public void mo96253d0() {
        C47511g gVar;
        WeakReference<C47511g> weakReference = this.f201751q1;
        if (weakReference != null && (gVar = weakReference.get()) != null) {
            gVar.notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public View mo64133e() {
        if (this.f201747m1 == null) {
            this.f201747m1 = new View(this.f201746l1);
        }
        return this.f201747m1;
    }

    /* renamed from: e0 */
    public void mo96254e0(C47511g gVar) {
        this.f201751q1 = new WeakReference<>(gVar);
    }

    /* renamed from: f */
    public boolean mo25956f(boolean z) {
        Log.m105919d("MicroMsg.NewTips.NormalIconNewTipPreference", "showRedPoint() show:%s", Boolean.valueOf(z));
        if (z) {
            mo96250V(0);
        } else {
            mo96250V(8);
            mo101937U(8);
            mo101934R(8);
            mo101936T(8);
        }
        mo96253d0();
        return true;
    }

    /* renamed from: g */
    public boolean mo25958g(boolean z, tg4 tg4) {
        Log.m105919d("MicroMsg.NewTips.NormalIconNewTipPreference", "showCounter() show:%s", Boolean.valueOf(z));
        if (z) {
            mo101936T(0);
            String str = tg4.f354435d + "";
            if (tg4.f354435d > 99) {
                str = this.f201746l1.getString(C0966R.string.jsy);
            }
            int b = C45081s1.m49933b(this.f121274d, tg4.f354435d);
            this.f215054P = str;
            this.f215055Q = b;
        } else {
            mo96250V(8);
            mo101937U(8);
            mo101934R(8);
            mo101936T(8);
        }
        mo96253d0();
        return true;
    }

    public String getPath() {
        return this.f201748n1;
    }

    /* renamed from: h */
    public boolean mo25960h(boolean z) {
        Log.m105919d("MicroMsg.NewTips.NormalIconNewTipPreference", "showNew() show:%s", Boolean.valueOf(z));
        if (z) {
            mo101936T(0);
            this.f215054P = this.f201746l1.getString(C0966R.string.f360088a12);
            this.f215055Q = C0966R.C0969drawable.ake;
        } else {
            mo96250V(8);
            mo101937U(8);
            mo101934R(8);
            mo101936T(8);
        }
        mo96253d0();
        return true;
    }

    /* renamed from: i */
    public boolean mo25962i(boolean z, tg4 tg4) {
        Log.m105919d("MicroMsg.NewTips.NormalIconNewTipPreference", "showRedPointTitle() show:%s", Boolean.valueOf(z));
        if (z) {
            mo96250V(8);
            mo101937U(0);
            mo101939Y(tg4.f354436e, -1, Color.parseColor("#8c8c8c"));
            mo101940Z(true);
            mo101934R(8);
        } else {
            mo96250V(8);
            mo101937U(8);
            mo101934R(8);
            mo101936T(8);
        }
        mo96253d0();
        return true;
    }

    /* renamed from: j */
    public boolean mo64135j(boolean z, tg4 tg4) {
        Class cls = C76057w.class;
        Log.m105919d("MicroMsg.NewTips.NormalIconNewTipPreference", "showRedPointIcon() show:%s", Boolean.valueOf(z));
        if (z) {
            mo96250V(8);
            mo101934R(0);
            mo101932N(0);
            mo101933P(0);
            mo101940Z(false);
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f201746l1.getResources(), C0966R.C0969drawable.bfa);
            if (this.f201755u1) {
                decodeResource = BitmapFactory.decodeResource(this.f201746l1.getResources(), C0966R.C0969drawable.bfd);
            }
            mo101930L(decodeResource);
            if (this.f201750p1 != null) {
                mo96251b0(tg4.f354437f);
            } else {
                Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(tg4.f354437f);
                if (this.f201752r1 != null) {
                    if (bitmap != null) {
                        C69941b bVar = this.f201753s1;
                        if (bVar != null) {
                            bVar.mo25932a((String) null);
                        }
                        mo101930L(bitmap);
                    } else {
                        C69941b bVar2 = this.f201753s1;
                        if (bVar2 != null) {
                            bVar2.mo25932a(tg4.f354437f);
                        }
                        ((C76057w) C86312j.m106911c(cls)).h60(tg4.f354437f, this.f201752r1);
                    }
                } else if (bitmap != null) {
                    this.f201749o1 = null;
                    mo101930L(this.f201755u1 ? BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) (bitmap.getWidth() / 2)) : BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.1f));
                } else {
                    ((C76057w) C86312j.m106911c(cls)).h60(tg4.f354437f, this.f201754t1);
                    this.f201749o1 = tg4.f354437f;
                }
            }
        } else {
            mo96250V(8);
            mo101937U(8);
            mo101934R(8);
            mo101936T(8);
        }
        mo96253d0();
        return true;
    }

    /* renamed from: k */
    public void mo64136k(C115631n nVar, boolean z) {
        ((C76963d) C86312j.m106911c(C76963d.class)).mo107037m2(this, nVar, z);
    }

    /* renamed from: l */
    public boolean mo64137l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo64138m(boolean z) {
        return ((C76963d) C86312j.m106911c(C76963d.class)).mo107036I0(z, this);
    }

    /* renamed from: n */
    public boolean mo64139n(boolean z, tg4 tg4) {
        Class cls = C76057w.class;
        Log.m105919d("MicroMsg.NewTips.NormalIconNewTipPreference", "showRedPointPointTitleIcon() show:%s", Boolean.valueOf(z));
        if (z) {
            mo96250V(8);
            mo101934R(0);
            mo101932N(0);
            mo101933P(0);
            mo101937U(0);
            mo101940Z(false);
            mo101939Y(tg4.f354436e, -1, Color.parseColor("#8c8c8c"));
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f201746l1.getResources(), C0966R.C0969drawable.bfa);
            if (this.f201755u1) {
                decodeResource = BitmapFactory.decodeResource(this.f201746l1.getResources(), C0966R.C0969drawable.bfd);
            }
            mo101930L(decodeResource);
            if (this.f201750p1 != null) {
                mo96251b0(tg4.f354437f);
            } else {
                Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(tg4.f354437f);
                if (this.f201752r1 != null) {
                    if (bitmap != null) {
                        C69941b bVar = this.f201753s1;
                        if (bVar != null) {
                            bVar.mo25932a((String) null);
                        }
                        mo101930L(bitmap);
                    } else {
                        ((C76057w) C86312j.m106911c(cls)).h60(tg4.f354437f, this.f201752r1);
                        C69941b bVar2 = this.f201753s1;
                        if (bVar2 != null) {
                            bVar2.mo25932a(tg4.f354437f);
                        }
                    }
                } else if (bitmap != null) {
                    this.f201749o1 = null;
                    mo101930L(this.f201755u1 ? BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) (bitmap.getWidth() / 2)) : BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.1f));
                } else {
                    ((C76057w) C86312j.m106911c(cls)).h60(tg4.f354437f, this.f201754t1);
                    this.f201749o1 = tg4.f354437f;
                }
            }
        } else {
            mo96250V(8);
            mo101937U(8);
            mo101934R(8);
            mo101936T(8);
        }
        mo96253d0();
        return true;
    }

    /* renamed from: o */
    public void mo64140o(boolean z, C115631n nVar) {
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        if (this.f201747m1 == null) {
            this.f201747m1 = x;
        }
        return x;
    }

    public NormalIconNewTipPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NormalIconNewTipPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f201749o1 = null;
        this.f201751q1 = null;
        this.f201754t1 = new C69939a();
        this.f201755u1 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52399a.f146476a, i, 0);
        this.f201748n1 = obtainStyledAttributes.getString(0);
        this.f201746l1 = context;
        obtainStyledAttributes.recycle();
        Log.m105925i("MicroMsg.NewTips.NormalIconNewTipPreference", "NormalIconNewTipPreference() path:%s", this.f201748n1);
    }
}
