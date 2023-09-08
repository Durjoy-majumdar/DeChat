package xi3;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: xi3.a */
public class C78844a {

    /* renamed from: a */
    public AccessibilityManager f231663a;

    /* renamed from: b */
    public Context f231664b;

    /* renamed from: c */
    public TextToSpeech f231665c = null;

    /* renamed from: d */
    public Vibrator f231666d;

    /* renamed from: e */
    public boolean f231667e;

    /* renamed from: f */
    public long f231668f;

    /* renamed from: xi3.a$b */
    public static class C15689b {

        /* renamed from: a */
        public static final C78844a f42385a = new C78844a(MMApplicationContext.getContext());
    }

    /* renamed from: xi3.a$a */
    public class C78845a implements TextToSpeech.OnInitListener {

        /* renamed from: a */
        public final /* synthetic */ String f231669a;

        public C78845a(String str) {
            this.f231669a = str;
        }

        public void onInit(int i) {
            TextToSpeech textToSpeech = C78844a.this.f231665c;
            if (textToSpeech != null) {
                textToSpeech.setLanguage(LocaleUtil.isChineseAppLang() ? Locale.CHINESE : Locale.ENGLISH);
                C78844a.this.f231665c.speak(this.f231669a, 0, (HashMap) null);
            }
        }
    }

    public C78844a(Context context) {
        this.f231664b = context;
        this.f231663a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    /* renamed from: g */
    public static final C78844a m95368g() {
        return C15689b.f42385a;
    }

    /* renamed from: a */
    public final void mo108836a(View view, int i, String str) {
        if (mo108842h(true) && this.f231664b != null && view != null) {
            int max = Math.max(i, 1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f231664b.getResources().getQuantityString(C0966R.plurals.f7223d, max, new Object[]{Integer.valueOf(max)}));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                String str2 = "";
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()) + ",";
                }
                view.setContentDescription(str2);
            }
        }
    }

    /* renamed from: b */
    public final void mo108837b(View view, String str, int i, String str2, String str3) {
        if (mo108842h(true) && this.f231664b != null && view != null && str != null && str2 != null && str3 != null) {
            C15690b bVar = new C15690b();
            bVar.mo14432a(str);
            if (i > 0) {
                bVar.mo14432a(this.f231664b.getResources().getQuantityString(C0966R.plurals.f7224e, 1, new Object[]{Integer.valueOf(i)}));
            }
            bVar.mo14432a(str2);
            bVar.mo14432a(str3);
            bVar.mo14433b(view);
        }
    }

    /* renamed from: c */
    public final void mo108838c(Activity activity, String str) {
        if (mo108842h(true) && !Util.isNullOrNil(str) && activity != null) {
            activity.getWindow().getDecorView().setContentDescription(activity.getString(C0966R.string.biq) + str);
            activity.getWindow().setTitle(str);
        }
    }

    /* renamed from: d */
    public final void mo108839d(View view, TextView textView, TextView textView2, TextView textView3, String str, TextView textView4, boolean z, TextView textView5, String str2, String str3, int i) {
        if (mo108842h(true) && this.f231664b != null && view != null && textView != null && textView2 != null && textView3 != null && textView5 != null) {
            C15690b bVar = new C15690b();
            bVar.mo14432a(textView.getText().toString());
            bVar.mo14432a(str);
            if (!(textView4 == null || textView4.getText() == null)) {
                bVar.mo14432a(textView4.getText().toString());
            }
            if (z) {
                bVar.mo14432a(this.f231664b.getString(C0966R.string.f360321bv1));
            }
            if (i == 1) {
                bVar.mo14432a(this.f231664b.getString(C0966R.string.buz));
            } else if (i > 1) {
                bVar.mo14432a(this.f231664b.getString(C0966R.string.f360320bv0));
            }
            if (textView3.getText() != null) {
                bVar.mo14432a(textView3.getText().toString());
            }
            if (textView2.getText() != null) {
                bVar.mo14432a(textView2.getText().toString());
            }
            if (textView5.getText() != null) {
                bVar.mo14432a(textView5.getText().toString());
            }
            if (str2 != null) {
                bVar.mo14432a(str2);
            }
            if (str3 != null) {
                bVar.mo14432a(str3);
            }
            bVar.mo14433b(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r8 > 0) goto L_0x002d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo108840e(android.view.View r7, java.lang.String r8, java.lang.String r9, int r10) {
        /*
            r6 = this;
            r0 = 1
            boolean r1 = r6.mo108842h(r0)
            if (r1 != 0) goto L_0x0008
            return
        L_0x0008:
            if (r7 == 0) goto L_0x006c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r1 != 0) goto L_0x006c
            android.content.Context r1 = r6.f231664b
            if (r1 != 0) goto L_0x0015
            goto L_0x006c
        L_0x0015:
            xi3.b r1 = new xi3.b
            r1.<init>()
            r1.mo14432a(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r2 = 0
            if (r8 != 0) goto L_0x002c
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r2)     // Catch:{ Exception -> 0x002b }
            if (r8 <= 0) goto L_0x002c
            goto L_0x002d
        L_0x002b:
        L_0x002c:
            r8 = 0
        L_0x002d:
            if (r8 <= 0) goto L_0x0047
            android.content.Context r9 = r6.f231664b
            android.content.res.Resources r9 = r9.getResources()
            r3 = 2131689507(0x7f0f0023, float:1.9008031E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4[r2] = r8
            java.lang.String r8 = r9.getQuantityString(r3, r0, r4)
            r1.mo14432a(r8)
        L_0x0047:
            android.content.Context r8 = r6.f231664b
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131689508(0x7f0f0024, float:1.9008033E38)
            r3 = 5
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            int r10 = r10 + r0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4[r0] = r10
            java.lang.String r8 = r8.getQuantityString(r9, r3, r4)
            r1.mo14432a(r8)
            r1.mo14433b(r7)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xi3.C78844a.mo108840e(android.view.View, java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: f */
    public void mo108841f(View view) {
        if (view != null) {
            Class<View> cls = View.class;
            try {
                Method method = cls.getMethod("clearAccessibilityFocus", new Class[0]);
                method.setAccessible(true);
                method.invoke(view, new Object[0]);
                Method method2 = cls.getMethod("requestAccessibilityFocus", new Class[0]);
                method2.setAccessible(true);
                method2.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Accessibility.AccessibilityHelper", e, "", new Object[0]);
            }
            if (this.f231666d != null) {
                this.f231666d = (Vibrator) MMApplicationContext.getContext().getSystemService("vibrator");
            }
            Vibrator vibrator = this.f231666d;
            if (vibrator != null) {
                vibrator.vibrate(50);
            }
        }
    }

    /* renamed from: h */
    public boolean mo108842h(boolean z) {
        if (!z || SystemClock.uptimeMillis() - this.f231668f > 2000) {
            AccessibilityManager accessibilityManager = this.f231663a;
            boolean z2 = true;
            if (accessibilityManager == null) {
                if (accessibilityManager == null) {
                    this.f231663a = (AccessibilityManager) this.f231664b.getSystemService("accessibility");
                }
                if (!(this.f231663a != null)) {
                    return false;
                }
            }
            boolean isEnabled = this.f231663a.isEnabled();
            boolean isTouchExplorationEnabled = this.f231663a.isTouchExplorationEnabled();
            if (!isEnabled || !isTouchExplorationEnabled) {
                z2 = false;
            }
            this.f231667e = z2;
            this.f231668f = SystemClock.uptimeMillis();
        }
        return this.f231667e;
    }

    /* renamed from: i */
    public boolean mo108843i() {
        return mo108842h(true) && (Settings.Secure.getInt(this.f231664b.getContentResolver(), "speak_password", 0) != 0 || ((AudioManager) this.f231664b.getSystemService("audio")).isWiredHeadsetOn());
    }

    /* renamed from: j */
    public void mo108844j(View view, String str) {
        TextToSpeech textToSpeech = this.f231665c;
        if (textToSpeech == null) {
            this.f231665c = new TextToSpeech(this.f231664b, new C78845a(str));
        } else {
            textToSpeech.setLanguage(LocaleUtil.isChineseAppLang() ? Locale.CHINESE : Locale.ENGLISH);
            this.f231665c.speak(str, 0, (HashMap) null);
        }
        mo108841f(view);
    }
}
