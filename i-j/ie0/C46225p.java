package ie0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import ge0.C32415b;
import gy3.C87412m;
import java.util.Map;
import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: ie0.p */
public final class C46225p {

    /* renamed from: a */
    public static final C46225p f124603a = new C46225p();

    /* renamed from: b */
    public static final boolean f124604b = BuildInfo.DEBUG;

    /* renamed from: c */
    public static final C46221k f124605c = new C46221k();

    /* renamed from: d */
    public static final C101611g<String, C72996z1> f124606d = new C100308d(20);

    /* renamed from: e */
    public static final C101611g<Integer, C46223m> f124607e = new C100308d(20);

    /* renamed from: a */
    public static final C46223m m51523a(String str) {
        int E;
        C46223m mVar = null;
        if (!(str == null || str.length() == 0)) {
            C46223m mVar2 = (C46223m) ((C101062d) f124607e).get(Integer.valueOf(str.hashCode()));
            if (mVar2 != null) {
                Log.m105927v("MicroMsg.OpenIMKefuContactLogic", "alvinluo kefuCard getCardContent from cache %s", mVar2.f124596a);
                return mVar2;
            }
            if (!(str.length() == 0)) {
                C46223m mVar3 = new C46223m();
                String str2 = "";
                int length = str.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = C87412m.m108596i(str.charAt(!z ? i : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                String obj = str.subSequence(i, length + 1).toString();
                if (!C112551y.m153820t(obj, "<", false, 2, (Object) null) && (E = C112550d0.m153769E(obj, XVFSFile.PATH_SEPARATOR, 0, false, 6, (Object) null)) != -1) {
                    obj = obj.substring(E + 1);
                    C87412m.m108593f(obj, "this as java.lang.String).substring(startIndex)");
                }
                Map<String, String> parseXml = XmlParser.parseXml(obj, "msg", (String) null);
                if (parseXml == null) {
                    Log.m105920e("MicroMsg.OpenIMKefuContactCardContent", "alvinluo kefuCard parse xml invalid");
                } else {
                    try {
                        String str3 = parseXml.get(".msg.$username");
                        if (str3 == null) {
                            str3 = str2;
                        }
                        mVar3.f124596a = str3;
                        String str4 = parseXml.get(".msg.$nickname");
                        if (str4 == null) {
                            str4 = str2;
                        }
                        mVar3.f124597b = str4;
                        String str5 = parseXml.get(".msg.$sex");
                        if (str5 == null) {
                            str5 = str2;
                        }
                        Util.getInt(str5, 0);
                        String str6 = parseXml.get(".msg.$bigheadimgurl");
                        if (str6 == null) {
                            str6 = str2;
                        }
                        mVar3.f124598c = str6;
                        String str7 = parseXml.get(".msg.$smallheadimgurl");
                        if (str7 == null) {
                            str7 = str2;
                        }
                        mVar3.f124599d = str7;
                        String str8 = parseXml.get(".msg.$openimappid");
                        String str9 = parseXml.get(".msg.$openimdesc");
                        if (str9 == null) {
                            str9 = str2;
                        }
                        mVar3.f124601f = str9;
                        String str10 = parseXml.get(".msg.$openimdescicon");
                        if (str10 == null) {
                            str10 = str2;
                        }
                        mVar3.f124600e = str10;
                        String str11 = parseXml.get(".msg.$ticket");
                        if (str11 != null) {
                            str2 = str11;
                        }
                        mVar3.f124602g = str2;
                        Log.m105924i("MicroMsg.OpenIMKefuContactCardContent", "alvinluo kefuCard parse user: " + mVar3.f124596a + ", headImageUrl: " + mVar3.f124598c + ", " + mVar3.f124599d + ", ticket: " + mVar3.f124602g);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.OpenIMKefuContactCardContent", e, "alvinluo kefuCard parse exception", new Object[0]);
                    }
                    mVar = mVar3;
                }
            }
            if (mVar != null) {
                ((C101062d) f124607e).mo139557c(Integer.valueOf(str.hashCode()), mVar);
            }
            return mVar;
        }
        Log.m105920e("MicroMsg.OpenIMKefuContactLogic", "alvinluo kefuCard getCardContent content null");
        return null;
    }

    /* renamed from: b */
    public static final C46220j m51524b(String str) {
        C46220j jVar = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        C46225p pVar = f124603a;
        C46221k kVar = f124605c;
        C46220j a = kVar.mo71633a(str);
        if (a != null) {
            return a;
        }
        C46226q yx02 = ((C32415b) C86312j.m106911c(C32415b.class)).yx0();
        if (yx02 != null) {
            jVar = yx02.mo71637jo(str);
        }
        if (jVar != null) {
            pVar.mo71636e(jVar.field_username, jVar);
        }
        return kVar.mo71633a(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0072, code lost:
        if (r5 > 0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00db, code lost:
        if (r5 > 0) goto L_0x00dd;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m51525c(ie0.C46220j r14) {
        /*
            java.lang.String r0 = "contact"
            gy3.C87412m.m108594g(r14, r0)
            ie0.p r0 = f124603a
            java.lang.Class<ge0.b> r1 = ge0.C32415b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ge0.b r1 = (ge0.C32415b) r1
            ie0.q r1 = r1.yx0()
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            if (r1 == 0) goto L_0x00de
            java.lang.String r5 = r14.field_username
            java.lang.String r6 = "contact.field_username"
            gy3.C87412m.m108593f(r5, r6)
            ie0.j r5 = r1.mo71637jo(r5)
            java.lang.String r6 = "MicroMsg.OpenIMKefuContactStorage"
            java.lang.String r7 = ", result: "
            java.lang.String r8 = "OpenIMKefuContact"
            if (r5 != 0) goto L_0x0075
            android.content.ContentValues r5 = r14.convertTo()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r1.f124609d
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r10 = ie0.C46220j.f124589p0
            java.lang.String r10 = r10.primaryKey
            long r8 = r9.insert(r8, r10, r5)
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0056
            r14.f124591Z = r8
            r10 = 2
            com.tencent.mm.storage.u3 r11 = r1.f124610e
            boolean r12 = r11 instanceof com.tencent.p014mm.sdk.storage.MStorageEx
            if (r12 == 0) goto L_0x0051
            r12 = r11
            com.tencent.mm.sdk.storage.MStorageEx r12 = (com.tencent.p014mm.sdk.storage.MStorageEx) r12
            java.lang.String r13 = r14.field_username
            r11.doNotify(r10, r12, r13)
        L_0x0051:
            java.lang.String r11 = r14.field_username
            r1.doNotify(r3, r10, r11)
        L_0x0056:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "insertContact username: "
            r1.append(r10)
            java.lang.String r10 = r14.field_username
            r1.append(r10)
            r1.append(r7)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            if (r5 <= 0) goto L_0x00de
            goto L_0x00dd
        L_0x0075:
            android.content.ContentValues r5 = r14.convertTo()
            java.lang.String r9 = "rowid"
            r5.remove(r9)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r1.f124609d
            java.lang.String[] r10 = new java.lang.String[r2]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            java.lang.String r12 = r14.field_username
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10[r4] = r11
            java.lang.String r11 = "username=?"
            int r5 = r9.update(r8, r5, r11, r10)
            if (r5 <= 0) goto L_0x00b2
            r8 = 3
            com.tencent.mm.storage.u3 r9 = r1.f124610e
            boolean r10 = r9 instanceof com.tencent.p014mm.sdk.storage.MStorageEx
            if (r10 == 0) goto L_0x00ad
            r10 = r9
            com.tencent.mm.sdk.storage.MStorageEx r10 = (com.tencent.p014mm.sdk.storage.MStorageEx) r10
            java.lang.String r11 = r14.field_username
            r9.doNotify(r8, r10, r11)
        L_0x00ad:
            java.lang.String r9 = r14.field_username
            r1.doNotify(r3, r8, r9)
        L_0x00b2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "updateContact "
            r1.append(r8)
            java.lang.String r8 = r14.mo71441O1()
            r1.append(r8)
            r1.append(r7)
            r1.append(r5)
            java.lang.String r7 = ", type: "
            r1.append(r7)
            long r7 = r14.field_type
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            if (r5 <= 0) goto L_0x00de
        L_0x00dd:
            r4 = 1
        L_0x00de:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "alvinluo replaceContactInDB success="
            r1.append(r5)
            r1.append(r4)
            r5 = 32
            r1.append(r5)
            java.lang.String r5 = r14.field_username
            r1.append(r5)
            java.lang.String r5 = ", info: "
            r1.append(r5)
            java.lang.String r5 = r14.mo71632l2()
            r1.append(r5)
            java.lang.String r5 = ", "
            r1.append(r5)
            boolean r5 = f124604b
            if (r5 == 0) goto L_0x0112
            com.tencent.mm.sdk.platformtools.MMStack r3 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r3 = r3.toString()
        L_0x0112:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.OpenIMKefuContactLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r4 == 0) goto L_0x0133
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            com.tencent.mm.storage.z1 r5 = r14.mo71631V()
            r1.mo69726u3(r5, r2)
        L_0x0133:
            if (r4 == 0) goto L_0x013b
            java.lang.String r1 = r14.field_username
            r0.mo71636e(r1, r14)
            goto L_0x015b
        L_0x013b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "replaceContact failed contactId: "
            r0.append(r1)
            long r1 = r14.f124591Z
            r0.append(r1)
            java.lang.String r1 = ", username: "
            r0.append(r1)
            java.lang.String r14 = r14.field_username
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r14)
        L_0x015b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ie0.C46225p.m51525c(ie0.j):boolean");
    }

    /* renamed from: d */
    public final String mo71635d(String str) {
        Uri parse = Uri.parse(str);
        String str2 = parse.getScheme() + "://" + parse.getHost() + XVFSFile.SEPARATOR_CHAR + parse.getPath();
        Log.m105925i("MicroMsg.OpenIMKefuContactLogic", "trimKfUrl %s", str2);
        return str2;
    }

    /* renamed from: e */
    public final void mo71636e(String str, C46220j jVar) {
        if (!(str == null || str.length() == 0)) {
            C46221k kVar = f124605c;
            kVar.getClass();
            C87412m.m108594g(str, "key");
            C87412m.m108594g(jVar, "contact");
            ((C101062d) kVar.f124592a).mo139557c(str, jVar);
            ((C101062d) f124606d).mo139557c(str, jVar.mo71631V());
        }
    }
}
