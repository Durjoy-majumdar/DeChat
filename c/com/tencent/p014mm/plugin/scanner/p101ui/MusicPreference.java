package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.scanner.p101ui.ProductUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import qc0.C101093a;
import qc0.C101105h;
import qc0.C89588n;

/* renamed from: com.tencent.mm.plugin.scanner.ui.MusicPreference */
public class MusicPreference extends Preference {

    /* renamed from: J */
    public View f273192J;

    /* renamed from: K */
    public ImageButton f273193K;

    /* renamed from: L */
    public boolean f273194L;

    /* renamed from: M */
    public View.OnClickListener f273195M;

    /* renamed from: N */
    public String f273196N;

    /* renamed from: P */
    public String f273197P;

    /* renamed from: Q */
    public String f273198Q;

    /* renamed from: R */
    public C94483b f273199R;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.MusicPreference$a */
    public class C94482a implements View.OnClickListener {
        public C94482a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/MusicPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (MusicPreference.this.f273199R == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/MusicPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (view.getId() == C0966R.C0970id.i1d) {
                MusicPreference musicPreference = MusicPreference.this;
                char c = 1;
                char c2 = 0;
                if (musicPreference.f273194L) {
                    musicPreference.f273194L = false;
                    musicPreference.f273193K.setImageResource(C0966R.C0969drawable.amb);
                } else {
                    musicPreference.f273194L = true;
                    musicPreference.f273193K.setImageResource(C0966R.C0969drawable.amc);
                }
                MusicPreference musicPreference2 = MusicPreference.this;
                ProductUI.C94494d dVar = (ProductUI.C94494d) musicPreference2.f273199R;
                dVar.getClass();
                if (!Util.isNullOrNil(musicPreference2.f273196N) || !Util.isNullOrNil(musicPreference2.f273197P)) {
                    int i = 2;
                    String format = String.format("%s_cd_%s", new Object[]{musicPreference2.f273196N, musicPreference2.f121285r});
                    ProductUI productUI = ProductUI.this;
                    int i2 = ProductUI.f273215R;
                    if (productUI.mo129966O7(format)) {
                        C101093a.m132490l();
                        Log.m105919d("MicroMsg.scanner.ProductUI", "isTheSameId, playMusicId : [%s]", format);
                    } else if (musicPreference2.f121279i == null) {
                        Log.m105920e("MicroMsg.scanner.ProductUI", "onPlayBtnClick, getTitle() == null");
                    } else {
                        int i3 = -1;
                        ProductUI.C71012o oVar = ProductUI.this.f273250y;
                        String k = oVar == null ? null : oVar.mo94827k();
                        String format2 = String.format("%s_cd_%s", new Object[]{musicPreference2.f273196N, musicPreference2.f121285r});
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) ProductUI.this.f273229N).iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            MusicPreference musicPreference3 = (MusicPreference) it.next();
                            Object[] objArr = new Object[i];
                            objArr[c2] = musicPreference3.f273196N;
                            objArr[c] = musicPreference3.f121285r;
                            String format3 = String.format("%s_cd_%s", objArr);
                            if (format2.equals(format3)) {
                                i3 = i4;
                            }
                            String charSequence = musicPreference3.f121279i.toString();
                            String str = musicPreference3.f273198Q;
                            String str2 = str;
                            ArrayList arrayList3 = arrayList2;
                            String str3 = musicPreference3.f273197P;
                            ArrayList arrayList4 = arrayList3;
                            arrayList4.add(C89588n.m112021a(5, k, charSequence, "", str2, str3, musicPreference3.f273196N, format3, C86709a0.m107535s().f251806d, k, "", "wx482a4001c37e2b74"));
                            c = 1;
                            i4++;
                            arrayList2 = arrayList4;
                            c2 = 0;
                            i = 2;
                        }
                        ArrayList arrayList5 = arrayList2;
                        if (i3 >= 0) {
                            MMHandlerThread.postToMainThread(new C101105h(arrayList5, i3));
                        }
                    }
                    ProductUI.this.mo129968Q7();
                } else {
                    Log.m105928w("MicroMsg.scanner.ProductUI", "wifiurl = null,  wapurl = null");
                    if (!Util.isNullOrNil(musicPreference2.f273198Q)) {
                        ProductUI productUI2 = ProductUI.this;
                        String str4 = musicPreference2.f273198Q;
                        int i5 = ProductUI.f273215R;
                        productUI2.mo129970S7(str4);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/MusicPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.MusicPreference$b */
    public interface C94483b {
    }

    public MusicPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: I */
    public void mo129953I(boolean z) {
        this.f273194L = z;
        ImageButton imageButton = this.f273193K;
        if (imageButton == null) {
            return;
        }
        if (z) {
            imageButton.setImageResource(C0966R.C0969drawable.amc);
        } else {
            imageButton.setImageResource(C0966R.C0969drawable.amb);
        }
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f273192J == null) {
            this.f273192J = mo1087x(viewGroup);
        }
        mo1086w(this.f273192J);
        return this.f273192J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f273195M == null) {
            this.f273195M = new C94482a();
        }
        ImageButton imageButton = (ImageButton) view.findViewById(C0966R.C0970id.i1d);
        this.f273193K = imageButton;
        imageButton.setOnClickListener(this.f273195M);
        if (this.f273194L) {
            this.f273193K.setImageResource(C0966R.C0969drawable.amc);
        } else {
            this.f273193K.setImageResource(C0966R.C0969drawable.amb);
        }
    }

    public MusicPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f273192J = null;
        this.f273193K = null;
        this.f273196N = "";
        this.f273197P = "";
        this.f273198Q = "";
        this.f121271G = C0966R.C0971layout.ber;
    }
}
