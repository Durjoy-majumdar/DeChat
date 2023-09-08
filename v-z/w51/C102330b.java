package w51;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k60.C99101e;
import l60.C99342a;
import l60.C99344b;
import n60.C100075f;
import te3.C101792j80;
import te3.C101824o80;
import u61.C14123e;
import x51.C102561f;
import x51.C102562g;

/* renamed from: w51.b */
public abstract class C102330b {

    /* renamed from: A */
    public ImageView f301377A;

    /* renamed from: B */
    public TextView f301378B;

    /* renamed from: C */
    public Context f301379C;

    /* renamed from: D */
    public View f301380D;

    /* renamed from: a */
    public View f301381a;

    /* renamed from: b */
    public int[] f301382b = {-1, -1};

    /* renamed from: c */
    public int f301383c = -1;

    /* renamed from: d */
    public C102562g f301384d;

    /* renamed from: e */
    public int f301385e;

    /* renamed from: f */
    public View f301386f;

    /* renamed from: g */
    public ImageView f301387g;

    /* renamed from: h */
    public ImageView f301388h;

    /* renamed from: i */
    public TextView f301389i;

    /* renamed from: j */
    public ImageView f301390j;

    /* renamed from: k */
    public View f301391k;

    /* renamed from: l */
    public TextView f301392l;

    /* renamed from: m */
    public TextView f301393m;

    /* renamed from: n */
    public ViewGroup f301394n;

    /* renamed from: o */
    public TextView f301395o;

    /* renamed from: p */
    public View f301396p;

    /* renamed from: q */
    public ProgressBar f301397q;

    /* renamed from: r */
    public ViewGroup f301398r;

    /* renamed from: s */
    public View f301399s;

    /* renamed from: t */
    public TextView f301400t;

    /* renamed from: u */
    public ImageView f301401u;

    /* renamed from: v */
    public View f301402v;

    /* renamed from: w */
    public ProgressBar f301403w;

    /* renamed from: x */
    public TextView f301404x;

    /* renamed from: y */
    public FrameLayout f301405y;

    /* renamed from: z */
    public View f301406z;

    public C102330b(Context context, View view) {
        ImageView imageView;
        int i;
        int i2;
        this.f301379C = context;
        LayoutInflater from = LayoutInflater.from(context);
        if (view == null) {
            view = null;
            if (from != null) {
                view = from.inflate(C0966R.C0971layout.a1m, (ViewGroup) null);
            }
        }
        this.f301380D = view;
        if (view != null) {
            this.f301381a = view;
            this.f301386f = view.findViewById(C0966R.C0970id.fa6);
            this.f301388h = (ImageView) this.f301381a.findViewById(C0966R.C0970id.f358473fc1);
            this.f301387g = (ImageView) this.f301381a.findViewById(C0966R.C0970id.fak);
            this.f301389i = (TextView) this.f301381a.findViewById(C0966R.C0970id.fbd);
            this.f301390j = (ImageView) this.f301381a.findViewById(C0966R.C0970id.j06);
            this.f301391k = this.f301381a.findViewById(C0966R.C0970id.fbf);
            this.f301392l = (TextView) this.f301381a.findViewById(C0966R.C0970id.fbg);
            this.f301393m = (TextView) this.f301381a.findViewById(C0966R.C0970id.fa9);
            this.f301394n = (ViewGroup) this.f301381a.findViewById(C0966R.C0970id.fap);
            this.f301395o = (TextView) this.f301381a.findViewById(C0966R.C0970id.fao);
            this.f301396p = this.f301381a.findViewById(C0966R.C0970id.chd);
            this.f301397q = (ProgressBar) this.f301381a.findViewById(C0966R.C0970id.i2h);
            this.f301399s = this.f301381a.findViewById(C0966R.C0970id.fbi);
            this.f301398r = (ViewGroup) this.f301381a.findViewById(C0966R.C0970id.fbs);
            this.f301400t = (TextView) this.f301381a.findViewById(C0966R.C0970id.fbx);
            this.f301401u = (ImageView) this.f301381a.findViewById(C0966R.C0970id.fby);
            this.f301402v = this.f301381a.findViewById(C0966R.C0970id.fbr);
            this.f301403w = (ProgressBar) this.f301381a.findViewById(C0966R.C0970id.fae);
            this.f301404x = (TextView) this.f301381a.findViewById(C0966R.C0970id.fa4);
            TextView textView = (TextView) this.f301381a.findViewById(C0966R.C0970id.fbh);
            this.f301405y = (FrameLayout) this.f301381a.findViewById(C0966R.C0970id.f358470fb2);
            this.f301406z = this.f301381a.findViewById(C0966R.C0970id.occ);
            this.f301377A = (ImageView) this.f301381a.findViewById(C0966R.C0970id.ocd);
            this.f301378B = (TextView) this.f301381a.findViewById(C0966R.C0970id.oce);
        }
        mo141883b();
        int[] c = mo141884c();
        if (c != null && (imageView = this.f301387g) != null && c.length == 2 && (i = c[0]) >= 0 && (i2 = c[1]) >= 0) {
            int[] iArr = this.f301382b;
            if (!(i == iArr[0] && i2 == iArr[1])) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = c[0];
                layoutParams.height = c[1];
                this.f301387g.setLayoutParams(layoutParams);
                this.f301382b = c;
            }
        }
        int d = mo141885d();
        View view2 = this.f301381a;
        if (!(view2 == null || d < 0 || this.f301383c == d)) {
            view2.setMinimumHeight(d);
            View view3 = this.f301386f;
            if (view3 != null) {
                view3.setMinimumHeight(d);
            }
        }
        view.setTag(this);
    }

    /* renamed from: a */
    public void mo141882a() {
        this.f301397q.setVisibility(8);
        this.f301398r.setBackgroundResource(C0966R.C0969drawable.f4653j6);
        this.f301398r.setVisibility(0);
        this.f301399s.setEnabled(true);
        this.f301400t.setText("");
        View view = this.f301402v;
        if (view == null) {
            this.f301403w.setVisibility(4);
        } else {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f301400t.setVisibility(0);
        this.f301400t.setText(C0966R.string.c8e);
        this.f301400t.setTextColor(this.f301379C.getResources().getColorStateList(C0966R.color.alc));
        this.f301401u.setVisibility(8);
    }

    /* renamed from: b */
    public abstract void mo141883b();

    /* renamed from: c */
    public abstract int[] mo141884c();

    /* renamed from: d */
    public abstract int mo141885d();

    /* renamed from: e */
    public final String mo141886e() {
        C101824o80 o802;
        C102562g gVar = this.f301384d;
        if (gVar == null || (o802 = gVar.f301983b) == null) {
            return null;
        }
        return o802.f298994d;
    }

    /* renamed from: f */
    public final String mo141887f() {
        C101824o80 o802;
        C102562g gVar = this.f301384d;
        if (gVar == null || (o802 = gVar.f301983b) == null) {
            return null;
        }
        return String.valueOf(o802.f298990A);
    }

    /* renamed from: g */
    public final int mo141888g() {
        C102562g gVar = this.f301384d;
        return (gVar == null ? null : Integer.valueOf(gVar.f301987f)).intValue();
    }

    /* renamed from: h */
    public abstract boolean mo141889h();

    /* renamed from: i */
    public void mo141890i() {
        if (this.f301384d != null && mo141889h()) {
            this.f301400t.setVisibility(8);
            this.f301400t.setTextColor(this.f301379C.getResources().getColorStateList(C0966R.color.f3142gq));
            int g = mo141888g();
            if (g == -2) {
                this.f301397q.setVisibility(8);
                this.f301398r.setBackgroundDrawable((Drawable) null);
                this.f301398r.setVisibility(0);
                this.f301399s.setEnabled(false);
                this.f301400t.setVisibility(0);
                this.f301400t.setText(C0966R.string.c8z);
                this.f301401u.setVisibility(4);
                View view = this.f301402v;
                if (view == null) {
                    this.f301403w.setVisibility(4);
                } else {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealNotAvailableBuyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealNotAvailableBuyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (g == 0) {
                mo141882a();
            } else if (g == 20) {
                this.f301397q.setVisibility(8);
                this.f301398r.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                this.f301398r.setEnabled(false);
                this.f301398r.setVisibility(0);
                View view3 = this.f301396p;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealActivityLimitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealActivityLimitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f301399s.setEnabled(false);
                TextView textView = this.f301400t;
                textView.setTextColor(textView.getResources().getColorStateList(C0966R.color.f3325nz));
                this.f301400t.setVisibility(0);
                this.f301400t.setText(C0966R.string.c79);
                this.f301401u.setVisibility(4);
                View view5 = this.f301402v;
                if (view5 == null) {
                    this.f301403w.setVisibility(4);
                } else {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(4);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealActivityLimitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealActivityLimitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (g != 3) {
                if (g != 4) {
                    if (g == 6) {
                        this.f301397q.setVisibility(8);
                        this.f301398r.setVisibility(8);
                        this.f301399s.setEnabled(false);
                        this.f301401u.setVisibility(8);
                        this.f301403w.setVisibility(0);
                        ProgressBar progressBar = this.f301403w;
                        C102562g gVar = this.f301384d;
                        progressBar.setProgress(gVar == null ? 0 : gVar.f301986e);
                        ProgressBar progressBar2 = this.f301403w;
                        String string = MMApplicationContext.getString(C0966R.string.c65);
                        Object[] objArr = new Object[1];
                        C102562g gVar2 = this.f301384d;
                        objArr[0] = Integer.valueOf(gVar2 == null ? 0 : gVar2.f301986e);
                        progressBar2.setContentDescription(String.format(string, objArr));
                        View view7 = this.f301402v;
                        if (view7 == null) {
                            this.f301403w.setVisibility(0);
                        } else {
                            C9556a aVar4 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar4.mo10233c(0);
                            View view8 = view7;
                            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view8, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else if (g == 7) {
                        C102562g gVar3 = this.f301384d;
                        if (gVar3.f301989h) {
                            Log.m105918d("MicroMsg.emoji.BaseEmojiItemHolder", "jacks use emoji");
                            this.f301397q.setVisibility(8);
                            this.f301398r.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                            this.f301398r.setVisibility(0);
                            this.f301398r.setTag(mo141886e());
                            this.f301399s.setEnabled(true);
                            this.f301400t.setVisibility(0);
                            this.f301400t.setText(C0966R.string.c_a);
                            this.f301400t.setTextColor(this.f301379C.getResources().getColorStateList(C0966R.color.alc));
                            this.f301401u.setVisibility(4);
                            View view9 = this.f301402v;
                            if (view9 == null) {
                                this.f301403w.setVisibility(4);
                                return;
                            }
                            C9556a aVar5 = new C9556a();
                            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                            aVar5.mo10233c(4);
                            View view10 = view9;
                            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealCurrentDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view10, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealCurrentDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        } else if (!gVar3.f301991j || !C102561f.m135423c(gVar3.f301983b.f299001n, 64)) {
                            this.f301397q.setVisibility(8);
                            this.f301398r.setVisibility(0);
                            this.f301398r.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                            this.f301400t.setVisibility(0);
                            this.f301400t.setText(C0966R.string.c8g);
                            this.f301400t.setTextColor(this.f301379C.getResources().getColorStateList(C0966R.color.f3140go));
                            this.f301401u.setVisibility(4);
                            this.f301399s.setEnabled(false);
                            View view11 = this.f301402v;
                            if (view11 == null) {
                                this.f301403w.setVisibility(4);
                            } else {
                                C9556a aVar6 = new C9556a();
                                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                                aVar6.mo10233c(4);
                                View view12 = view11;
                                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                C117292a.m165359e(view12, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        } else {
                            this.f301398r.setVisibility(0);
                            this.f301398r.setBackgroundResource(C0966R.C0969drawable.f4663je);
                            this.f301400t.setVisibility(0);
                            this.f301400t.setText(C0966R.string.c9b);
                            this.f301400t.setTextColor(this.f301379C.getResources().getColorStateList(C0966R.color.alc));
                            this.f301401u.setVisibility(4);
                            this.f301399s.setEnabled(true);
                            View view13 = this.f301402v;
                            if (view13 == null) {
                                this.f301403w.setVisibility(4);
                                return;
                            }
                            C9556a aVar7 = new C9556a();
                            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                            aVar7.mo10233c(4);
                            View view14 = view13;
                            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                            C117292a.m165359e(view14, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                    } else if (g != 8) {
                        switch (g) {
                            case 10:
                                this.f301397q.setVisibility(8);
                                this.f301398r.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                                this.f301398r.setVisibility(0);
                                this.f301400t.setVisibility(0);
                                this.f301400t.setText(C0966R.string.f360375c93);
                                this.f301401u.setVisibility(4);
                                this.f301399s.setEnabled(true);
                                View view15 = this.f301402v;
                                if (view15 != null) {
                                    C9556a aVar8 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                                    aVar8.mo10233c(4);
                                    View view16 = view15;
                                    C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                                    C117292a.m165359e(view16, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    break;
                                } else {
                                    this.f301403w.setVisibility(4);
                                    break;
                                }
                            case 11:
                                this.f301397q.setVisibility(0);
                                this.f301398r.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                                this.f301398r.setVisibility(0);
                                this.f301400t.setVisibility(0);
                                this.f301400t.setText("");
                                this.f301399s.setEnabled(false);
                                this.f301401u.setVisibility(4);
                                View view17 = this.f301402v;
                                if (view17 != null) {
                                    C9556a aVar9 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                                    aVar9.mo10233c(4);
                                    View view18 = view17;
                                    C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                                    C117292a.m165359e(view18, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    break;
                                } else {
                                    this.f301403w.setVisibility(4);
                                    break;
                                }
                            case 12:
                                break;
                            default:
                                Log.m105929w("MicroMsg.emoji.BaseEmojiItemHolder", "unknow product status:%d", Integer.valueOf(mo141888g()));
                                break;
                        }
                    } else {
                        this.f301397q.setVisibility(8);
                        this.f301398r.setBackgroundDrawable((Drawable) null);
                        this.f301398r.setVisibility(0);
                        this.f301399s.setEnabled(false);
                        this.f301400t.setVisibility(0);
                        this.f301400t.setText(C0966R.string.c8h);
                        this.f301401u.setVisibility(4);
                        View view19 = this.f301402v;
                        if (view19 == null) {
                            this.f301403w.setVisibility(4);
                        } else {
                            C9556a aVar10 = new C9556a();
                            ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                            aVar10.mo10233c(4);
                            View view20 = view19;
                            C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                            C117292a.m165359e(view20, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                this.f301397q.setVisibility(8);
                this.f301398r.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                this.f301398r.setVisibility(0);
                View view21 = this.f301402v;
                if (view21 == null) {
                    this.f301403w.setVisibility(4);
                } else {
                    C9556a aVar11 = new C9556a();
                    ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
                    aVar11.mo10233c(4);
                    View view22 = view21;
                    C117292a.m165358d(view22, aVar11.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view21.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view22, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f301399s.setEnabled(true);
                this.f301401u.setVisibility(4);
                this.f301400t.setVisibility(0);
                C101824o80 o802 = this.f301384d.f301983b;
                if (o802 != null) {
                    if ((o802.f299001n & 512) == 512) {
                        this.f301400t.setText(C14123e.f39523a.mo13542b(this.f301379C, o802.f298990A, "", -1));
                        this.f301400t.setContentDescription(String.format(MMApplicationContext.getString(C0966R.string.ca8), new Object[]{Integer.valueOf(this.f301384d.f301983b.f298990A)}));
                    } else {
                        this.f301400t.setText(o802.f298999i);
                        this.f301400t.setContentDescription(String.format(MMApplicationContext.getString(C0966R.string.c7b), new Object[]{this.f301400t.getText()}));
                    }
                    this.f301400t.setTextColor(this.f301379C.getResources().getColorStateList(C0966R.color.alc));
                    this.f301398r.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                }
            } else {
                mo141882a();
            }
            C101824o80 o803 = this.f301384d.f301983b;
            if (o803 != null) {
                C101792j80 j802 = o803.f298993D;
                if (EmojiLogic.m117490u(j802)) {
                    View view23 = this.f301406z;
                    C9556a aVar12 = new C9556a();
                    ThreadLocal<C9556a> threadLocal11 = C60958c.f173611a;
                    aVar12.mo10233c(0);
                    View view24 = view23;
                    C117292a.m165358d(view24, aVar12.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view23.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                    C117292a.m165359e(view24, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    String str = j802.f298503e;
                    if (str != null) {
                        C99344b<String, Bitmap> e = C99101e.f290571b.mo85955a(str);
                        C100075f.C100076a aVar13 = new C100075f.C100076a();
                        aVar13.f293176b = true;
                        e.f291319c = aVar13.mo139398a();
                        ((C99342a) e).mo85954d(this.f301377A);
                    }
                    this.f301378B.setText(j802.f298504f);
                    this.f301394n.setVisibility(8);
                    return;
                }
                View view25 = this.f301406z;
                C9556a aVar14 = new C9556a();
                ThreadLocal<C9556a> threadLocal12 = C60958c.f173611a;
                aVar14.mo10233c(8);
                C117292a.m165358d(view25, aVar14.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view25.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                C117292a.m165359e(view25, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "refreshRightBtnView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: j */
    public void mo141891j(String str, boolean z) {
        C101824o80 o802;
        C102562g gVar = this.f301384d;
        if (gVar == null || (o802 = gVar.f301983b) == null || !EmojiLogic.m117490u(o802.f298993D)) {
            this.f301394n.setVisibility(0);
            this.f301395o.setVisibility(0);
            this.f301395o.setText(str);
            View view = this.f301396p;
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "setIntroduce", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "setIntroduce", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: k */
    public void mo141892k(String str) {
        C101824o80 o802;
        C102562g gVar = this.f301384d;
        if (gVar != null && (o802 = gVar.f301983b) != null && EmojiLogic.m117490u(o802.f298993D)) {
            return;
        }
        if (Util.isNullOrNil(str)) {
            this.f301394n.setVisibility(8);
            this.f301395o.setVisibility(8);
            return;
        }
        this.f301394n.setVisibility(0);
        this.f301395o.setVisibility(0);
        this.f301395o.setText(str);
    }

    /* renamed from: l */
    public void mo141893l(int i) {
        View view = this.f301399s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "setRightBtnRootVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder", "setRightBtnRootVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: m */
    public void mo141894m(int i) {
        this.f301388h.setVisibility(i);
    }
}
