package o62;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import d62.C7241k;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o90.C100308d;
import p261wl.C38166b;
import p629ny.C76979h;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: o62.b */
public class C11373b extends C86301e implements C7241k {

    /* renamed from: d */
    public Map<String, LinkedList<C7241k.C7246e>> f33479d = new HashMap();

    /* renamed from: e */
    public Map<String, LinkedList<C7241k.C7242a>> f33480e = new HashMap();

    /* renamed from: f */
    public Map<String, HashSet<C7241k.C7249h>> f33481f = new HashMap();

    /* renamed from: g */
    public LinkedList<C7241k.C7245d> f33482g = new LinkedList<>();

    public C11373b() {
        new C100308d(200);
        new C100308d(500);
    }

    /* renamed from: TV */
    public CharSequence mo8408TV(long j, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.SysMsgTemplateImp", "hy: request translate content is null!");
            return null;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
        if (parseXml == null) {
            Log.m105924i("MicroMsg.SysMsgTemplateImp", "hy: not retrieved sysmsg from new xml!");
            return null;
        }
        String str2 = parseXml.get(".sysmsg.$type");
        if (!Util.isNullOrNil(str2) && "sysmsgtemplate".equals(str2)) {
            return zx0(parseXml, bundle, weakReference, 0, weakReference2);
        }
        Log.m105929w("MicroMsg.SysMsgTemplateImp", "hy: not acceptable sysmsg: %s", str2);
        return null;
    }

    /* renamed from: cF */
    public CharSequence mo8409cF(String str, Bundle bundle) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.SysMsgTemplateImp", "hy: [digest] request translate content is null!");
            return null;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
        if (parseXml == null) {
            Log.m105924i("MicroMsg.SysMsgTemplateImp", "hy: [digest] not retrieved sysmsg from new xml!");
            return null;
        }
        String str2 = parseXml.get(".sysmsg.$type");
        if (!Util.isNullOrNil(str2) && "sysmsgtemplate".equals(str2)) {
            return zx0(parseXml, bundle, (WeakReference<Context>) null, 1, (WeakReference<NeatTextView>) null);
        }
        Log.m105929w("MicroMsg.SysMsgTemplateImp", "hy: [digest] not acceptable sysmsg: %s", str2);
        return null;
    }

    /* renamed from: gZ */
    public void mo8410gZ(String str, C7241k.C7246e eVar) {
        if (!((HashMap) this.f33479d).containsKey(str)) {
            ((HashMap) this.f33479d).put(str, new LinkedList());
        }
        List list = (List) ((HashMap) this.f33479d).get(str);
        Log.m105925i("MicroMsg.SysMsgTemplateImp", "hy: adding template listener: %s list=%s", str, list);
        if (list != null && !list.contains(eVar)) {
            ((LinkedList) ((HashMap) this.f33479d).get(str)).add(eVar);
        }
    }

    public void h80(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        try {
            String string = bundle.getString("template_type");
            HashSet hashSet = (HashSet) ((HashMap) this.f33481f).get(string);
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((C7241k.C7249h) it.next()).mo7773u2(str, map, bundle, weakReference, weakReference2);
                }
            }
            C38166b.m41756c(C7241k.C7248g.class, string, new b$$b(str, map, bundle, weakReference, weakReference2));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SysMsgTemplateImp", e, "", new Object[0]);
        }
    }

    /* renamed from: pS */
    public void mo8412pS(String str, C7241k.C7249h hVar) {
        MMHandlerThread.postToMainThread(new b$$c(this, str, hVar));
    }

    public void sn0(String str, C7241k.C7249h hVar) {
        MMHandlerThread.postToMainThread(new b$$d(this, str, hVar));
    }

    public final CharSequence vx0(ArrayList<CharSequence> arrayList) {
        CharSequence spannableString = new SpannableString("");
        if (arrayList == null) {
            return spannableString;
        }
        Iterator<CharSequence> it = arrayList.iterator();
        while (it.hasNext()) {
            spannableString = TextUtils.concat(new CharSequence[]{spannableString, it.next()});
        }
        return spannableString;
    }

    public final boolean wx0(String str) {
        return "link_profile".equals(str) || "link_revoke".equals(str) || "link_revoke_qrcode".equals(str) || "link_plain".equals(str) || "link_view_wxapp".equals(str) || "link_succeed_contact".equals(str) || "link_jump_chat".equals(str) || "link_admin_explain".equals(str) || "new_link_succeed_contact".equals(str) || "link_live".equals(str) || "link_url".equals(str) || "comment_link_profile".equals(str) || "link_revoke_unbindapp".equals(str) || "link_history".equals(str);
    }

    public final CharSequence xx0(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0) ? new SpannableString("") : charSequence;
    }

    public final CharSequence yx0(String str, Map<String, String> map) {
        boolean z = false;
        if (Util.getInt(map.get(str + ".$hidden"), 0) == 1) {
            z = true;
        }
        if (z) {
            Log.m105926v("MicroMsg.SysMsgTemplateImp", "hy: hide");
            return new SpannableString("");
        }
        return new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), Util.nullAsNil(map.get(str + ".plain"))));
    }

    public void z60(String str) {
        Log.m105925i("MicroMsg.SysMsgTemplateImp", "hy: removing template listener: %s", str);
        if (!((HashMap) this.f33479d).containsKey(str)) {
            Log.m105929w("MicroMsg.SysMsgTemplateImp", "[removeTemplateListener] mHandleListener is not contains this linkName:%s", str);
        }
        LinkedList linkedList = (LinkedList) ((HashMap) this.f33479d).get(str);
        if (linkedList == null) {
            Log.m105920e("MicroMsg.SysMsgTemplateImp", "list is null!");
            return;
        }
        Log.m105925i("MicroMsg.SysMsgTemplateImp", "[removeTemplateListener] linkName(%s) list size:%s", str, Integer.valueOf(linkedList.size()));
        if (linkedList.size() > 0) {
            linkedList.removeLast();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence zx0(java.util.Map<java.lang.String, java.lang.String> r26, android.os.Bundle r27, java.lang.ref.WeakReference<android.content.Context> r28, int r29, java.lang.ref.WeakReference<com.tencent.neattextview.textview.view.NeatTextView> r30) {
        /*
            r25 = this;
            r0 = r25
            r7 = r26
            r8 = r27
            r9 = r29
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = 0
            r12 = 0
        L_0x000f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r13 = ""
            r1.append(r13)
            if (r12 != 0) goto L_0x001d
            r2 = r13
            goto L_0x0021
        L_0x001d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
        L_0x0021:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ".sysmsg.sysmsgtemplate.content_template"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object r2 = r7.get(r1)
            java.lang.String r14 = "MicroMsg.SysMsgTemplateImp"
            if (r2 != 0) goto L_0x0057
            int r1 = r10.size()
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = "hy: not handled"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r1)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r13)
            return r1
        L_0x0052:
            java.lang.CharSequence r1 = r0.vx0(r10)
            return r1
        L_0x0057:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r15 = ".$type"
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "tmpl_type_profile"
            boolean r3 = r3.equals(r2)
            r6 = 1
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = "tmpl_type_profilewithrevoke"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = "tmpl_type_profilewithrevokeqrcode"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = "tmpl_type_wxappnotifywithview"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = "tmpl_type_succeed_contact"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = "tmpl_type_jump_chat"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = "tmpl_type_gamelife_link_url"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = "tmpl_type_gamelife_plain"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = "new_tmpl_type_succeed_contact"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = "tmpl_type_profilewithrevokeandunbindapp"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r3 = 0
            goto L_0x00cc
        L_0x00cb:
            r3 = 1
        L_0x00cc:
            if (r3 != 0) goto L_0x00de
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r11] = r2
            java.lang.String r4 = "hy: non supported type: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r4, r3)
            java.lang.CharSequence r3 = r0.yx0(r1, r7)
            r10.add(r3)
        L_0x00de:
            if (r8 == 0) goto L_0x00e6
            java.lang.String r3 = "template_type"
            r8.putString(r3, r2)
        L_0x00e6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".template"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r11] = r1
            java.lang.String r3 = "hy: rawTemplate : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r14, r3, r2)
            java.util.ArrayList r1 = o62.C11379f.m11201a(r1)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            if (r1 != 0) goto L_0x0110
            r3 = 0
            goto L_0x0114
        L_0x0110:
            int r3 = r1.size()
        L_0x0114:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r11] = r3
            java.lang.String r3 = "hy: parsed %d models"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r3, r2)
            if (r1 == 0) goto L_0x0405
            int r2 = r1.size()
            if (r2 != 0) goto L_0x0129
            goto L_0x0405
        L_0x0129:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r16 = r1.iterator()
        L_0x0132:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x03f1
            java.lang.Object r1 = r16.next()
            r4 = r1
            o62.f$a r4 = (o62.C11379f.C11380a) r4
            int r1 = r4.f33505a
            r17 = 0
            if (r1 != 0) goto L_0x01c2
            java.util.LinkedList<d62.k$d> r1 = r0.f33482g
            java.util.Iterator r1 = r1.iterator()
        L_0x014b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0163
            java.lang.Object r2 = r1.next()
            d62.k$d r2 = (d62.C7241k.C7245d) r2
            java.lang.Boolean r3 = r2.mo8418d(r7)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x014b
            r17 = r2
        L_0x0163:
            if (r17 != 0) goto L_0x0199
            java.lang.Class<d62.k$f> r1 = d62.C7241k.C7247f.class
            wl.d r1 = p261wl.C38166b.m41759f(r1)
            wl.b$a r1 = (p261wl.C38166b.C38167a) r1
            wl.b$a$b r2 = new wl.b$a$b
            wl.d<T> r3 = r1.f100837d
            java.lang.Iterable r3 = r3.all()
            java.util.Iterator r3 = r3.iterator()
            r2.<init>(r1, r3)
        L_0x017c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0199
            java.lang.Object r1 = r2.next()
            wl.i r1 = (p261wl.C38174i) r1
            java.lang.Object r1 = r1.get()
            d62.k$f r1 = (d62.C7241k.C7247f) r1
            java.lang.Boolean r3 = r1.mo8418d(r7)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x017c
            goto L_0x019b
        L_0x0199:
            r1 = r17
        L_0x019b:
            if (r1 == 0) goto L_0x01a7
            java.lang.String r2 = r4.f33506b
            java.lang.CharSequence r1 = r1.mo8419q(r7, r2)
            r5.add(r1)
            goto L_0x01e1
        L_0x01a7:
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = r4.f33506b
            android.text.SpannableString r2 = r2.mo107057T1(r3, r4)
            r1.<init>(r2)
            r5.add(r1)
            goto L_0x01e1
        L_0x01c2:
            if (r1 != r6) goto L_0x03e5
            r3 = 0
        L_0x01c5:
            java.lang.String r1 = ".sysmsg.sysmsgtemplate.content_template.link_list.link"
            if (r3 == 0) goto L_0x01d8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
        L_0x01d8:
            r2 = r1
            java.lang.Object r1 = r7.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x01e5
        L_0x01e1:
            r2 = r5
            r1 = 1
            goto L_0x03ec
        L_0x01e5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r6 = ".$name"
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = r4.f33506b
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x03d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            if (r9 != 0) goto L_0x033b
            boolean r1 = r0.wx0(r6)
            if (r1 == 0) goto L_0x031a
            java.util.Map<java.lang.String, java.util.LinkedList<d62.k$e>> r1 = r0.f33479d
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r6)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0248
            int r1 = r1.size()
            if (r1 > 0) goto L_0x0235
            goto L_0x0248
        L_0x0235:
            java.util.Map<java.lang.String, java.util.LinkedList<d62.k$e>> r1 = r0.f33479d
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r6)
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r1 = r1.getLast()
            d62.k$e r1 = (d62.C7241k.C7246e) r1
            r19 = r1
            goto L_0x024a
        L_0x0248:
            r19 = r17
        L_0x024a:
            if (r19 == 0) goto L_0x0265
            r1 = r19
            r6 = r2
            r2 = r26
            r20 = r3
            r3 = r6
            r21 = r4
            r4 = r27
            r22 = r5
            r5 = r28
            r18 = r6
            r6 = r30
            java.lang.CharSequence r1 = r1.mo8420G4(r2, r3, r4, r5, r6)
            goto L_0x02ba
        L_0x0265:
            r18 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            java.lang.Class<d62.k$c> r1 = d62.C7241k.C7244c.class
            wl.d r1 = p261wl.C38166b.m41759f(r1)
            wl.b$a r1 = (p261wl.C38166b.C38167a) r1
            wl.b$a$b r5 = new wl.b$a$b
            wl.d<T> r2 = r1.f100837d
            java.lang.Iterable r2 = r2.all()
            java.util.Iterator r2 = r2.iterator()
            r5.<init>(r1, r2)
            r1 = r17
        L_0x0286:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x02ba
            java.lang.Object r2 = r5.next()
            wl.i r2 = (p261wl.C38174i) r2
            boolean r3 = r2.hasKey(r6)
            if (r3 == 0) goto L_0x02b1
            java.lang.Object r1 = r2.get()
            d62.k$c r1 = (d62.C7241k.C7244c) r1
            r2 = r26
            r3 = r18
            r4 = r27
            r23 = r5
            r5 = r28
            r24 = r6
            r6 = r30
            java.lang.CharSequence r1 = r1.mo8417G4(r2, r3, r4, r5, r6)
            goto L_0x02b5
        L_0x02b1:
            r23 = r5
            r24 = r6
        L_0x02b5:
            r5 = r23
            r6 = r24
            goto L_0x0286
        L_0x02ba:
            if (r1 == 0) goto L_0x02fa
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x02ef
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 == 0) goto L_0x02ef
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r3 = r1.length()
            java.lang.Class<android.text.style.ClickableSpan> r4 = android.text.style.ClickableSpan.class
            java.lang.Object[] r2 = r2.getSpans(r11, r3, r4)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
            if (r2 == 0) goto L_0x02ef
            int r3 = r2.length
            if (r3 <= 0) goto L_0x02ef
            int r3 = r2.length
            r4 = 0
        L_0x02dc:
            if (r4 >= r3) goto L_0x02ef
            r5 = r2[r4]
            boolean r5 = r5 instanceof rj3.C13010a
            if (r5 == 0) goto L_0x02e7
            int r4 = r4 + 1
            goto L_0x02dc
        L_0x02e7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "hy: actively throw Exception!!! all clickable spans must be instance of com.tencent.mm.ui.base.span.IPressableSpan!"
            r1.<init>(r2)
            throw r1
        L_0x02ef:
            java.lang.CharSequence r1 = r0.xx0(r1)
            r2 = r22
            r2.add(r1)
            goto L_0x03db
        L_0x02fa:
            r2 = r22
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            if (r19 != 0) goto L_0x0303
            r6 = 1
            goto L_0x0304
        L_0x0303:
            r6 = 0
        L_0x0304:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            r3[r11] = r4
            java.lang.String r4 = "alvinluo listener == null: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r3)
            r3 = r18
            java.lang.CharSequence r3 = r0.yx0(r3, r7)
            r2.add(r3)
            goto L_0x03dc
        L_0x031a:
            r20 = r3
            r21 = r4
            r24 = r6
            r1 = 1
            r3 = r2
            r2 = r5
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r5 = r24
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r13)
            r4[r11] = r5
            java.lang.String r5 = "alvinluo not support link type: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r4)
            java.lang.CharSequence r3 = r0.yx0(r3, r7)
            r2.add(r3)
            goto L_0x03dc
        L_0x033b:
            r20 = r3
            r21 = r4
            r1 = 1
            r3 = r2
            r2 = r5
            r5 = r6
            if (r9 != r1) goto L_0x03d0
            boolean r4 = r0.wx0(r5)
            if (r4 != 0) goto L_0x0354
            java.lang.CharSequence r3 = r0.yx0(r3, r7)
            r2.add(r3)
            goto L_0x03dc
        L_0x0354:
            java.util.Map<java.lang.String, java.util.LinkedList<d62.k$a>> r4 = r0.f33480e
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0378
            int r4 = r4.size()
            if (r4 > 0) goto L_0x0367
            goto L_0x0378
        L_0x0367:
            java.util.Map<java.lang.String, java.util.LinkedList<d62.k$a>> r4 = r0.f33480e
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            java.lang.Object r4 = r4.getLast()
            d62.k$a r4 = (d62.C7241k.C7242a) r4
            goto L_0x037a
        L_0x0378:
            r4 = r17
        L_0x037a:
            if (r4 != 0) goto L_0x03c4
            java.lang.Class<d62.k$b> r4 = d62.C7241k.C7243b.class
            wl.d r4 = p261wl.C38166b.m41759f(r4)
            wl.b$a r4 = (p261wl.C38166b.C38167a) r4
            wl.b$a$b r6 = new wl.b$a$b
            wl.d<T> r11 = r4.f100837d
            java.lang.Iterable r11 = r11.all()
            java.util.Iterator r11 = r11.iterator()
            r6.<init>(r4, r11)
            r4 = r17
        L_0x0395:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x03b2
            java.lang.Object r11 = r6.next()
            wl.i r11 = (p261wl.C38174i) r11
            boolean r19 = r11.hasKey(r5)
            if (r19 == 0) goto L_0x0395
            java.lang.Object r4 = r11.get()
            d62.k$b r4 = (d62.C7241k.C7243b) r4
            java.lang.String r4 = r4.mo8416M4(r7, r3, r8)
            goto L_0x0395
        L_0x03b2:
            if (r4 == 0) goto L_0x03bc
            java.lang.CharSequence r3 = r0.xx0(r4)
            r2.add(r3)
            goto L_0x03dc
        L_0x03bc:
            java.lang.CharSequence r3 = r0.yx0(r3, r7)
            r2.add(r3)
            goto L_0x03dc
        L_0x03c4:
            java.lang.String r3 = r4.mo8415M4(r7, r3, r8)
            java.lang.CharSequence r3 = r0.xx0(r3)
            r2.add(r3)
            goto L_0x03dc
        L_0x03d0:
            java.lang.String r3 = "hy: not supported digest type"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r3)
            goto L_0x03dc
        L_0x03d6:
            r20 = r3
            r21 = r4
            r2 = r5
        L_0x03db:
            r1 = 1
        L_0x03dc:
            int r3 = r20 + 1
            r5 = r2
            r4 = r21
            r6 = 1
            r11 = 0
            goto L_0x01c5
        L_0x03e5:
            r2 = r5
            r1 = 1
            java.lang.String r3 = "hy: invalid! should not get here"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r3)
        L_0x03ec:
            r5 = r2
            r6 = 1
            r11 = 0
            goto L_0x0132
        L_0x03f1:
            r2 = r5
            r1 = 1
            java.lang.CharSequence r2 = r0.vx0(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r2
            java.lang.String r4 = "hy: concatedvalue is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r14, r4, r1)
            r10.add(r2)
            goto L_0x040e
        L_0x0405:
            r3 = 0
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r13)
            r10.add(r1)
        L_0x040e:
            int r12 = r12 + 1
            r11 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: o62.C11373b.zx0(java.util.Map, android.os.Bundle, java.lang.ref.WeakReference, int, java.lang.ref.WeakReference):java.lang.CharSequence");
    }
}
