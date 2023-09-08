package je0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.p136ui.base.EllipsizeTextView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.p133ui.span.MMTextAppearanceSpan;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import de3.C75370s;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import ge0.C32415b;
import hc0.C20937c;
import he0.C76158j;
import ic0.C21070h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import jc0.C21210b;
import kg3.C76577a;
import ob0.C117747y;
import p823sg.C90193h;
import re0.C36304a;
import re0.C36306c;
import re0.C36314k;
import te3.C48971c83;
import te3.C49111d83;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: je0.t0 */
public class C76407t0 extends C86301e implements C76158j {

    /* renamed from: d */
    public HashMap<String, C76412e> f223718d = new HashMap<>();

    /* renamed from: e */
    public EllipsizeTextView.C73156a f223719e = new C76408a(this);

    /* renamed from: f */
    public EllipsizeTextView.C73156a f223720f = new C76409b(this);

    /* renamed from: je0.t0$a */
    public class C76408a implements EllipsizeTextView.C73156a {
        public C76408a(C76407t0 t0Var) {
        }

        /* renamed from: a */
        public CharSequence mo101616a(TextView textView, CharSequence charSequence, String str, int i, int i2) {
            CharSequence charSequence2;
            CharSequence charSequence3;
            TextPaint paint = textView.getPaint();
            float measureText = paint.measureText(" " + str);
            int measuredWidth = (textView.getMeasuredWidth() - textView.getCompoundPaddingRight()) - textView.getCompoundPaddingLeft();
            double d = (double) measuredWidth;
            if (((double) measureText) >= 0.6d * d) {
                charSequence3 = TextUtils.ellipsize(charSequence, textView.getPaint(), (float) (d * 0.4d), TextUtils.TruncateAt.END);
                charSequence2 = TextUtils.ellipsize(str, textView.getPaint(), (((float) measuredWidth) - textView.getPaint().measureText(charSequence3.toString())) - 20.0f, TextUtils.TruncateAt.END);
            } else {
                charSequence3 = TextUtils.ellipsize(charSequence, textView.getPaint(), ((float) measuredWidth) - measureText, TextUtils.TruncateAt.END);
                charSequence2 = str;
            }
            Context context = textView.getContext();
            SpannableString f = C75370s.m90380f(context, charSequence3 + " " + charSequence2);
            ColorStateList e = C76577a.m92154e(textView.getContext(), i);
            f.setSpan(new TextAppearanceSpan((String) null, 0, i2, e, e), charSequence3.length() + 1, charSequence3.length() + 1 + charSequence2.length(), 33);
            return f;
        }
    }

    /* renamed from: je0.t0$b */
    public class C76409b implements EllipsizeTextView.C73156a {
        public C76409b(C76407t0 t0Var) {
        }

        /* renamed from: a */
        public CharSequence mo101616a(TextView textView, CharSequence charSequence, String str, int i, int i2) {
            Drawable drawable = textView.getContext().getResources().getDrawable(C0966R.raw.open_im_main_logo);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            CharSequence ellipsize = TextUtils.ellipsize(charSequence, textView.getPaint(), ((float) ((textView.getMeasuredWidth() - textView.getCompoundPaddingRight()) - textView.getCompoundPaddingLeft())) - (((float) drawable.getIntrinsicWidth()) + textView.getPaint().measureText(" ")), TextUtils.TruncateAt.END);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ellipsize);
            spannableStringBuilder.append(" ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), ellipsize.length(), ellipsize.length() + 1, 33);
            return spannableStringBuilder;
        }
    }

    /* renamed from: je0.t0$c */
    public class C76410c implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ C76411d f223721a;

        public C76410c(C76407t0 t0Var, C76411d dVar) {
            this.f223721a = dVar;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Bitmap bitmap;
            if (bVar.f59985a == 0 && (bitmap = bVar.f59988d) != null && !bitmap.isRecycled()) {
                this.f223721a.f223722a = bVar.f59988d;
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: je0.t0$d */
    public class C76411d {

        /* renamed from: a */
        public Bitmap f223722a;

        public C76411d(C76407t0 t0Var, C76406s0 s0Var) {
        }
    }

    /* renamed from: je0.t0$e */
    public class C76412e {

        /* renamed from: a */
        public LinkedList<String> f223723a = new LinkedList<>();

        /* renamed from: b */
        public LinkedList<String> f223724b = new LinkedList<>();

        public C76412e(C76407t0 t0Var, C76406s0 s0Var) {
        }
    }

    public C76407t0() {
        C86013q1.m106461v("wcf://openim/");
        C36306c cVar = new C36306c();
        cVar.field_appid = "3552365301";
        cVar.field_language = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        cVar.field_subType = 0;
        ((C32415b) C86312j.m106911c(C32415b.class)).wx0().get(cVar, "appid", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "subType");
        if (cVar.systemRowid == -1) {
            vx0("3552365301", LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), "", 0);
        }
    }

    public SpannableString D30(Context context, String str, String str2, int i) {
        return C75370s.m90380f(context, str);
    }

    public CharSequence De0(Context context, String str, String str2, float f) {
        Bitmap Lk0 = Lk0(str);
        if (Lk0 == null) {
            return str2;
        }
        SpannableString f2 = C75370s.m90380f(context, "  " + str2);
        int b = (int) (f + ((float) C76577a.m92151b(context, 2)));
        ImageSpan imageSpan = new ImageSpan(MMApplicationContext.getContext(), Lk0);
        imageSpan.getDrawable().setBounds(0, 0, b, b);
        f2.setSpan(imageSpan, 0, 1, 33);
        return f2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: android.text.SpannableString} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: LW */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo106359LW(android.content.Context r10, android.widget.TextView r11, java.lang.CharSequence r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.tencent.p014mm.p136ui.base.EllipsizeTextView
            java.lang.String r1 = " @"
            r2 = 2131101266(0x7f060652, float:1.7814937E38)
            java.lang.String r3 = "3552365301"
            if (r0 == 0) goto L_0x0040
            com.tencent.mm.ui.base.EllipsizeTextView r11 = (com.tencent.p014mm.p136ui.base.EllipsizeTextView) r11
            java.lang.Class<he0.j> r10 = he0.C76158j.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            he0.j r10 = (he0.C76158j) r10
            java.lang.String r10 = r10.mo106373wo(r13, r14)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r14 != 0) goto L_0x0035
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0037
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            goto L_0x0037
        L_0x0035:
            java.lang.String r10 = ""
        L_0x0037:
            com.tencent.mm.ui.base.EllipsizeTextView$a r13 = r9.f223719e
            r11.setLayoutCallback(r13)
            r11.mo101613a(r12, r10, r2, r15)
            return
        L_0x0040:
            java.lang.String r14 = r9.mo106373wo(r13, r14)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r0 != 0) goto L_0x008c
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x005f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r13.append(r14)
            java.lang.String r14 = r13.toString()
        L_0x005f:
            android.text.SpannableString r12 = de3.C75370s.m90380f(r10, r12)
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            r13.<init>()
            r13.append(r12)
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r14)
            android.content.res.ColorStateList r8 = kg3.C76577a.m92154e(r10, r2)
            android.text.style.TextAppearanceSpan r10 = new android.text.style.TextAppearanceSpan
            r4 = 0
            r5 = 0
            r3 = r10
            r6 = r15
            r7 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r15 = 0
            int r14 = r14.length()
            r0 = 33
            r12.setSpan(r10, r15, r14, r0)
            r13.append(r12)
            goto L_0x0090
        L_0x008c:
            android.text.SpannableString r13 = de3.C75370s.m90380f(r10, r12)
        L_0x0090:
            r11.setText(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je0.C76407t0.mo106359LW(android.content.Context, android.widget.TextView, java.lang.CharSequence, java.lang.String, java.lang.String, int):void");
    }

    public Bitmap Lk0(String str) {
        C76411d dVar = new C76411d(this, (C76406s0) null);
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59346b = true;
        bVar.f59350f = "wcf://openim/" + C90193h.m112878f(str.getBytes());
        C92837k0.zx0().mo32520i(str, (ImageView) null, bVar.mo32666a(), new C76410c(this, dVar));
        return dVar.f223722a;
    }

    public void Mg0(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        Class cls = C32415b.class;
        if (!Util.isNullOrNil(str)) {
            StringBuffer stringBuffer = new StringBuffer();
            C36306c cVar = new C36306c();
            cVar.field_appid = str3;
            cVar.field_language = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
            cVar.field_subType = i2;
            ((C32415b) C86312j.m106911c(cls)).wx0().get(cVar, "appid", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "subType");
            stringBuffer.append(String.format("openIMAppIdinfo.field_updateTime %s | ", new Object[]{Long.valueOf(cVar.field_updateTime)}));
            boolean z = cVar.systemRowid == -1 || Util.secondsToNow(cVar.field_updateTime) > 172800;
            if (!z && !Util.isNullOrNil(str2)) {
                C36314k kVar = new C36314k();
                kVar.field_appid = str3;
                kVar.field_language = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
                kVar.field_wordingId = str4;
                ((C32415b) C86312j.m106911c(cls)).Bx0().get(kVar, "appid", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "wordingId");
                if (kVar.systemRowid == -1 || Util.secondsToNow(kVar.field_updateTime) > 172800) {
                    z = true;
                }
                stringBuffer.append(String.format("wordingInfo.field_updateTime %s | ", new Object[]{Long.valueOf(kVar.field_updateTime)}));
            }
            Log.m105925i("MicroMsg.Openim.OpenImResourceMgr", "checkRecUpdate openimAppId %s wordingId %s needUpdate %s subType: %s, logBuffer: %s", str3, str4, Boolean.valueOf(z), Integer.valueOf(i), stringBuffer.toString());
            if (z) {
                vx0(str3, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), str4, i2);
            }
        }
    }

    public String Rn0(String str, String str2, C76158j.C8510a aVar) {
        C36306c cVar = new C36306c();
        cVar.field_appid = str;
        cVar.field_subType = 0;
        ((C32415b) C86312j.m106911c(C32415b.class)).wx0().get(cVar, "appid", "subType");
        if (cVar.systemRowid == -1) {
            vx0(str, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), "", 0);
            return null;
        }
        String wx02 = wx0(cVar.field_acctTypeId, str2, aVar, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        return wx02 == null ? wx0(cVar.field_acctTypeId, str2, aVar, "en") : wx02;
    }

    public String S10(String str, String str2, C76158j.C8510a aVar, int i) {
        String xx02 = xx0(str, str2, aVar, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), i);
        return xx02 == null ? xx0(str, str2, aVar, "en", i) : xx02;
    }

    /* renamed from: Xg */
    public void mo106364Xg() {
        Class cls = C32415b.class;
        ((C32415b) C86312j.m106911c(cls)).wx0().f96659d.delete("OpenIMAppIdInfo", (String) null, (String[]) null);
        ((C32415b) C86312j.m106911c(cls)).vx0().f96656d.delete("OpenIMAccTypeInfo", (String) null, (String[]) null);
        ((C32415b) C86312j.m106911c(cls)).Bx0().f96671d.delete("OpenIMWordingInfo", (String) null, (String[]) null);
    }

    public int b10(String str, int i) {
        C36306c cVar = new C36306c();
        cVar.field_appid = str;
        cVar.field_subType = i;
        ((C32415b) C86312j.m106911c(C32415b.class)).wx0().get(cVar, "appid", "subType");
        if (cVar.systemRowid != -1) {
            return cVar.field_appRec.f140141d;
        }
        vx0(str, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), "", i);
        return 0;
    }

    public CharSequence bm0(Context context, CharSequence charSequence) {
        if (Util.isNullOrNil(charSequence)) {
            charSequence = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append(" ");
        Drawable drawable = context.getResources().getDrawable(C0966R.raw.open_im_main_logo);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new ImageSpan(drawable), charSequence.length(), charSequence.length() + 1, 33);
        return spannableStringBuilder;
    }

    /* renamed from: cY */
    public TextAppearanceSpan mo106367cY(Context context, String str, int i, int i2) {
        if (!"3552365301".equals(str)) {
            return null;
        }
        ColorStateList e = C76577a.m92154e(context, i2);
        return new MMTextAppearanceSpan((String) null, 0, i, e, e);
    }

    /* renamed from: lU */
    public void mo106368lU(Context context, TextView textView, CharSequence charSequence) {
        if (textView instanceof EllipsizeTextView) {
            EllipsizeTextView ellipsizeTextView = (EllipsizeTextView) textView;
            ellipsizeTextView.setLayoutCallback(this.f223720f);
            ellipsizeTextView.mo101613a(charSequence, " ", -1, (int) textView.getTextSize());
            return;
        }
        textView.setText(((C76158j) C86312j.m106911c(C76158j.class)).bm0(context, charSequence));
    }

    /* renamed from: nc */
    public String mo106369nc(String str, String str2, C76158j.C8510a aVar) {
        String wx02 = wx0(str, str2, aVar, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        return wx02 == null ? wx0(str, str2, aVar, "en") : wx02;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 453 && i == 0 && i2 == 0) {
            C33548p pVar = (C33548p) yVar;
            HashMap<String, C76412e> hashMap = this.f223718d;
            C76412e eVar = hashMap.get(pVar.f90827f + pVar.f90828g + pVar.f90830i);
            if (eVar != null) {
                eVar.f223724b.clear();
                if (!eVar.f223723a.isEmpty()) {
                    while (eVar.f223724b.size() < 10 && !eVar.f223723a.isEmpty()) {
                        eVar.f223724b.add(eVar.f223723a.removeFirst());
                    }
                    C86709a0.m107529k().f251779b.mo123460f(new C33548p(pVar.f90827f, pVar.f90828g, eVar.f223724b, pVar.f90830i));
                    return;
                }
                HashMap<String, C76412e> hashMap2 = this.f223718d;
                hashMap2.remove(pVar.f90827f + pVar.f90828g + pVar.f90830i);
            }
        }
    }

    /* renamed from: tU */
    public void mo106371tU(String str, String str2, String str3) {
        vx0(str, str2, str3, 0);
    }

    /* renamed from: vO */
    public void mo106372vO(String str, String str2, String str3) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var.mo101231Y5() && C72996z1.m85843n5(z1Var.getUsername())) {
            C86709a0.m107529k().f251779b.mo123460f(new C33544n(str, z1Var.mo62927s3() ? "" : Util.nullAsNil(str2), str3));
        }
    }

    public final void vx0(String str, String str2, String str3, int i) {
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.Openim.OpenImResourceMgr", "try checkDoSceneGetRec openimAppId %s language %s wordingid %s, subType: %s", str, str2, str3, Integer.valueOf(i));
            HashMap<String, C76412e> hashMap = this.f223718d;
            if (!hashMap.containsKey(str + str2 + i)) {
                C76412e eVar = new C76412e(this, (C76406s0) null);
                if (!Util.isNullOrNil(str3)) {
                    eVar.f223724b.add(str3);
                }
                HashMap<String, C76412e> hashMap2 = this.f223718d;
                hashMap2.put(str + str2 + i, eVar);
                C86709a0.m107529k().f251779b.mo123460f(new C33548p(str, str2, eVar.f223724b, i));
            }
            if (!Util.isNullOrNil(str3)) {
                HashMap<String, C76412e> hashMap3 = this.f223718d;
                C76412e eVar2 = hashMap3.get(str + str2 + i);
                if (!eVar2.f223723a.contains(str3) && !eVar2.f223724b.contains(str3)) {
                    eVar2.f223723a.add(str3);
                }
            }
        }
    }

    /* renamed from: wo */
    public String mo106373wo(String str, String str2) {
        String yx02 = yx0(str, str2, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        return yx02 == null ? yx0(str, str2, "en") : yx02;
    }

    public final String wx0(String str, String str2, C76158j.C8510a aVar, String str3) {
        C36304a aVar2 = new C36304a();
        aVar2.field_acctTypeId = str;
        aVar2.field_language = str3;
        ((C32415b) C86312j.m106911c(C32415b.class)).vx0().get(aVar2, "acctTypeId", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
        if (aVar2.systemRowid == -1) {
            return null;
        }
        if (aVar == C76158j.C8510a.TYPE_WORDING) {
            Iterator<C49111d83> it = aVar2.field_accTypeRec.f132057e.iterator();
            while (it.hasNext()) {
                C49111d83 next = it.next();
                if (str2.equals(next.f132184d)) {
                    return next.f132185e;
                }
            }
            return null;
        }
        Iterator<C48971c83> it4 = aVar2.field_accTypeRec.f132058f.iterator();
        while (it4.hasNext()) {
            C48971c83 next2 = it4.next();
            if (str2.equals(next2.f131574d)) {
                return next2.f131575e;
            }
        }
        return null;
    }

    public final String xx0(String str, String str2, C76158j.C8510a aVar, String str3, int i) {
        C36306c cVar = new C36306c();
        cVar.field_appid = str;
        cVar.field_language = str3;
        cVar.field_subType = i;
        ((C32415b) C86312j.m106911c(C32415b.class)).wx0().get(cVar, "appid", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "subType");
        if (cVar.systemRowid == -1) {
            vx0(str, str3, "", i);
            return null;
        } else if (aVar == C76158j.C8510a.TYPE_WORDING) {
            Iterator<C49111d83> it = cVar.field_appRec.f140142e.iterator();
            while (it.hasNext()) {
                C49111d83 next = it.next();
                if (str2.equals(next.f132184d)) {
                    return next.f132185e;
                }
            }
            return null;
        } else {
            Iterator<C48971c83> it4 = cVar.field_appRec.f140143f.iterator();
            while (it4.hasNext()) {
                C48971c83 next2 = it4.next();
                if (str2.equals(next2.f131574d)) {
                    return next2.f131575e;
                }
            }
            return null;
        }
    }

    public void ym0(String str, String str2) {
        Mg0(str, str2, 0);
    }

    public final String yx0(String str, String str2, String str3) {
        C36314k kVar = new C36314k();
        kVar.field_appid = str;
        kVar.field_language = str3;
        kVar.field_wordingId = str2;
        ((C32415b) C86312j.m106911c(C32415b.class)).Bx0().get(kVar, "appid", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "wordingId");
        if (kVar.systemRowid != -1) {
            return kVar.field_wording;
        }
        vx0(str, str3, str2, 0);
        return null;
    }
}
