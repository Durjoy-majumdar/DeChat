package com.tencent.p014mm.plugin.label.p067ui;

import a22.C0008d;
import a22.C27740g;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import cm0.C28613b;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberScrollBar;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72955b2;
import com.tencent.p014mm.storage.C72960e2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d22.C45259e;
import d22.C45260f;
import d22.C75319a;
import di3.C86312j;
import e22.C58520j;
import e22.C75496c;
import e22.C75502f;
import e22.C75505g;
import e22.C75507h;
import e22.C75509i;
import e22.C75515l;
import e22.C7586a;
import e22.C7587b;
import e22.C7588d;
import e22.C7589e;
import e22.C7591k;
import e22.C7592m;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p680ru.C77570i;
import sf0.C77691f;
import te3.C48946c3;
import te3.C50422mm2;
import te3.ap4;
import z04.C112550d0;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/label/ui/ContactEditLabel;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/ui/contact/g1;", "Lcom/tencent/mm/sdk/storage/MStorageEx$IOnStorageChange;", "Lob0/n;", "<init>", "()V", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.label.ui.ContactEditLabel */
public final class ContactEditLabel extends MMActivity implements C74493g1, MStorageEx.IOnStorageChange, C11385n {

    /* renamed from: A */
    public C69040a f198447A;

    /* renamed from: B */
    public int f198448B;

    /* renamed from: C */
    public int f198449C;

    /* renamed from: D */
    public EditText f198450D;

    /* renamed from: E */
    public final MMHandler f198451E = new C69041b(this, Looper.getMainLooper());

    /* renamed from: d */
    public final String f198452d = "MicroMsg.Label.ContactEditLabel";

    /* renamed from: e */
    public final int f198453e = 7001;

    /* renamed from: f */
    public final int f198454f = TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE;

    /* renamed from: g */
    public String f198455g;

    /* renamed from: h */
    public String f198456h;

    /* renamed from: i */
    public String f198457i;

    /* renamed from: j */
    public C72955b2 f198458j;

    /* renamed from: n */
    public boolean f198459n;

    /* renamed from: o */
    public String f198460o;

    /* renamed from: p */
    public boolean f198461p = true;

    /* renamed from: q */
    public ArrayList<String> f198462q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<String> f198463r = new ArrayList<>();

    /* renamed from: s */
    public final HashSet<String> f198464s = new HashSet<>();

    /* renamed from: t */
    public final HashSet<String> f198465t = new HashSet<>();

    /* renamed from: u */
    public final HashSet<String> f198466u = new HashSet<>();

    /* renamed from: v */
    public ProgressDialog f198467v;

    /* renamed from: w */
    public String f198468w;

    /* renamed from: x */
    public boolean f198469x;

    /* renamed from: y */
    public final String f198470y = "intent_status_mgr";

    /* renamed from: z */
    public ListView f198471z;

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactEditLabel$a */
    public final class C69040a extends C74526m1 {

        /* renamed from: n */
        public Cursor f198472n;

        /* renamed from: o */
        public final HashMap<String, Integer> f198473o = new HashMap<>();

        /* renamed from: p */
        public final SparseArray<String> f198474p = new SparseArray<>();

        /* renamed from: q */
        public String f198475q = "";

        /* renamed from: r */
        public final LinkedList<String> f198476r = new LinkedList<>();

        /* renamed from: s */
        public final /* synthetic */ ContactEditLabel f198477s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69040a(ContactEditLabel contactEditLabel, C74493g1 g1Var) {
            super(g1Var, (List<String>) null, true, false);
            C87412m.m108594g(g1Var, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.f198477s = contactEditLabel;
            mo7853r();
        }

        public int getCount() {
            int i;
            Cursor cursor = this.f198472n;
            int i2 = 0;
            if (cursor == null) {
                i = 0;
            } else {
                C87412m.m108591d(cursor);
                i = cursor.getCount();
            }
            SparseArray<String> sparseArray = this.f198474p;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            }
            return i + i2 + 4;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: gl3.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: gl3.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: gl3.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: gl3.r} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: e22.j0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: gl3.r} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: e22.l0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: gl3.r} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: gl3.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: gl3.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: gl3.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: gl3.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: gl3.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public gl3.C75922b mo7850h(int r6) {
            /*
                r5 = this;
                if (r6 != 0) goto L_0x0019
                com.tencent.mm.plugin.label.ui.ContactEditLabel r0 = r5.f198477s
                r1 = 2131834105(0x7f1134f9, float:1.930131E38)
                java.lang.String r0 = r0.getString(r1)
                java.lang.String r1 = "getString(R.string.pref_name_title)"
                gy3.C87412m.m108593f(r0, r1)
                gl3.r r1 = new gl3.r
                r1.<init>(r6)
                r1.f222731x = r0
                goto L_0x00f5
            L_0x0019:
                r0 = 1
                if (r6 != r0) goto L_0x0033
                com.tencent.mm.plugin.label.ui.ContactEditLabel r0 = r5.f198477s
                java.lang.String r0 = r0.f198456h
                gy3.C87412m.m108591d(r0)
                e22.l0 r1 = new e22.l0
                r1.<init>(r6, r0)
                com.tencent.mm.plugin.label.ui.b r6 = new com.tencent.mm.plugin.label.ui.b
                com.tencent.mm.plugin.label.ui.ContactEditLabel r0 = r5.f198477s
                r6.<init>(r0)
                r1.f221892F = r6
                goto L_0x00f5
            L_0x0033:
                r1 = 2
                if (r6 != r1) goto L_0x005e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "标签成员 ("
                r0.append(r1)
                com.tencent.mm.plugin.label.ui.ContactEditLabel r1 = r5.f198477s
                java.util.ArrayList<java.lang.String> r1 = r1.f198462q
                int r1 = r1.size()
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                gl3.r r1 = new gl3.r
                r1.<init>(r6)
                r1.f222731x = r0
                goto L_0x00f5
            L_0x005e:
                r2 = 3
                if (r6 != r2) goto L_0x0071
                e22.j0 r1 = new e22.j0
                r1.<init>(r6)
                com.tencent.mm.plugin.label.ui.a r6 = new com.tencent.mm.plugin.label.ui.a
                com.tencent.mm.plugin.label.ui.ContactEditLabel r0 = r5.f198477s
                r6.<init>(r0)
                r1.f221881B = r6
                goto L_0x00f5
            L_0x0071:
                android.util.SparseArray<java.lang.String> r2 = r5.f198474p
                int r2 = r2.indexOfKey(r6)
                if (r2 < 0) goto L_0x008e
                android.util.SparseArray<java.lang.String> r0 = r5.f198474p
                java.lang.Object r0 = r0.get(r6)
                java.lang.String r1 = "posHeaderMap[position]"
                gy3.C87412m.m108593f(r0, r1)
                java.lang.String r0 = (java.lang.String) r0
                gl3.r r1 = new gl3.r
                r1.<init>(r6)
                r1.f222731x = r0
                goto L_0x00f5
            L_0x008e:
                r2 = 4
                r3 = r6
            L_0x0090:
                android.util.SparseArray<java.lang.String> r4 = r5.f198474p
                int r4 = r4.indexOfKey(r3)
                if (r4 < 0) goto L_0x009a
                int r2 = r2 + 1
            L_0x009a:
                int r3 = r3 + -1
                if (r3 >= 0) goto L_0x0090
                int r2 = r6 - r2
                android.database.Cursor r3 = r5.f198472n
                gy3.C87412m.m108591d(r3)
                boolean r3 = r3.moveToPosition(r2)
                r4 = 0
                if (r3 == 0) goto L_0x00dd
                com.tencent.mm.storage.z1 r1 = new com.tencent.mm.storage.z1
                r1.<init>()
                android.database.Cursor r2 = r5.f198472n
                r1.convertFrom(r2)
                gl3.h r2 = new gl3.h
                r2.<init>(r6)
                r2.mo106181j(r1)
                java.lang.String r6 = r1.getUsername()
                boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
                if (r6 == 0) goto L_0x00d1
                r2.f222608e = r4
                r2.f222611h = r4
                r2.f222610g = r4
                r2.f222680F = r0
                goto L_0x00db
            L_0x00d1:
                boolean r6 = r5.f219057f
                r2.f222608e = r6
                boolean r6 = r5.f219058g
                r2.f222611h = r6
                r2.f222680F = r4
            L_0x00db:
                r1 = r2
                goto L_0x00f5
            L_0x00dd:
                com.tencent.mm.plugin.label.ui.ContactEditLabel r3 = r5.f198477s
                java.lang.String r3 = r3.f198452d
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r1[r4] = r6
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                r1[r0] = r6
                java.lang.String r6 = "create contact item error: position=%d | index=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r1)
                r1 = 0
            L_0x00f5:
                gy3.C87412m.m108591d(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel.C69040a.mo7850h(int):gl3.b");
        }

        /* renamed from: i */
        public void mo7851i() {
            mo103564g();
            Cursor cursor = this.f198472n;
            if (cursor != null) {
                C87412m.m108591d(cursor);
                cursor.close();
                this.f198472n = null;
            }
        }

        /* renamed from: q */
        public int mo7852q(String str) {
            if (!this.f198473o.containsKey(str)) {
                return -1;
            }
            Integer num = this.f198473o.get(str);
            C87412m.m108591d(num);
            return num.intValue() + this.f219055d.mo7831f6().getHeaderViewsCount();
        }

        /* renamed from: r */
        public void mo7853r() {
            Log.m105924i(this.f198477s.f198452d, "resetData");
            Cursor cursor = this.f198472n;
            if (cursor != null) {
                C87412m.m108591d(cursor);
                cursor.close();
                this.f198472n = null;
            }
            this.f198473o.clear();
            this.f198474p.clear();
            String[] strArr = new String[0];
            int[] iArr = new int[0];
            this.f198472n = null;
            ArrayList<String> arrayList = this.f198477s.f198462q;
            if (arrayList == null || arrayList.size() == 0) {
                Log.m105924i(this.f198477s.f198452d, "mCurrentList is null | mCurrenList size == 0");
            } else {
                C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                Object[] array = this.f198477s.f198462q.toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                this.f198472n = Ni.mo69670S3((String[]) array, this.f198475q, "@all.contact.android", "", (List<String>) null);
                Object[] array2 = this.f198477s.f198462q.toArray(new String[0]);
                C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                strArr = C45628s0.m50804v((String[]) array2, "@all.contact.android", "", this.f198475q, (List<String>) null);
                Object[] array3 = this.f198477s.f198462q.toArray(new String[0]);
                C87412m.m108592e(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                iArr = C45628s0.m50800t((String[]) array3, "@all.contact.android", "", (List<String>) null, this.f198475q);
            }
            if (!(strArr == null || iArr == null)) {
                int i = 4;
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 < iArr.length) {
                        this.f198473o.put(strArr[i2], Integer.valueOf(iArr[i2] + i));
                        this.f198474p.put(iArr[i2] + i, strArr[i2]);
                        i++;
                    }
                }
            }
            mo103564g();
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactEditLabel$b */
    public static final class C69041b extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ ContactEditLabel f198478a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69041b(ContactEditLabel contactEditLabel, Looper looper) {
            super(looper);
            this.f198478a = contactEditLabel;
        }

        public void handleMessage(Message message) {
            C87412m.m108594g(message, "msg");
            int i = message.what;
            if (i == 6001) {
                C69040a aVar = this.f198478a.f198447A;
                if (aVar != null) {
                    aVar.mo7853r();
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            } else if (i != 6002) {
                Log.m105929w(this.f198478a.f198452d, "unknow message. what is:%d", Integer.valueOf(i));
            } else {
                ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
            }
        }
    }

    /* renamed from: H7 */
    public static final void m81331H7(ContactEditLabel contactEditLabel) {
        Log.m105924i(contactEditLabel.f198452d, "cpan[saveLabelChange]");
        String string = contactEditLabel.getString(C0966R.string.g2h);
        C87412m.m108593f(string, "getString(R.string.label_saving)");
        contactEditLabel.f198467v = C76879j.m92723Q(contactEditLabel, contactEditLabel.getString(C0966R.string.a3h), string, true, true, C7591k.f25860d);
        String nullAs = Util.nullAs(contactEditLabel.f198456h, "");
        contactEditLabel.f198456h = nullAs;
        C87412m.m108591d(nullAs);
        int length = nullAs.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = C87412m.m108596i(nullAs.charAt(!z ? i : length), 32) <= 0;
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
        String obj = nullAs.subSequence(i, length + 1).toString();
        contactEditLabel.f198456h = obj;
        if (Util.isNullOrNil(obj)) {
            contactEditLabel.hideLoading();
            C76879j.m92749t(contactEditLabel, contactEditLabel.getString(C0966R.string.f360931g24), "", C58520j.f167556d);
        } else if (C45078p0.m49927f(contactEditLabel.f198456h) > 36) {
            contactEditLabel.hideLoading();
            String string2 = contactEditLabel.getString(C0966R.string.f7386es);
            C87412m.m108593f(string2, "getString(R.string.add_label_over_count)");
            String format = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(C45078p0.m49923b(36, ""))}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            C76879j.m92749t(contactEditLabel, format, "", C58520j.f167556d);
        } else {
            String str = contactEditLabel.f198456h;
            C87412m.m108591d(str);
            if (!(!Util.isNullOrNil(C27740g.vx0().mo100944LL(str))) || !contactEditLabel.f198461p) {
                String str2 = contactEditLabel.f198456h;
                C87412m.m108591d(str2);
                if (!(!Util.isNullOrNil(C27740g.vx0().mo100944LL(str2))) || Util.isNullOrNil(contactEditLabel.f198455g) || C87412m.m108589b(contactEditLabel.f198455g, contactEditLabel.f198456h)) {
                    C72955b2 bF = C27740g.vx0().mo100950bF(contactEditLabel.f198457i);
                    if (contactEditLabel.f198461p || bF.field_isTemporary) {
                        String str3 = contactEditLabel.f198456h;
                        C87412m.m108591d(str3);
                        C97625j3.m125815e().mo123460f(new C75319a(str3));
                        return;
                    }
                    int i2 = Util.getInt(contactEditLabel.f198457i, 0);
                    String str4 = contactEditLabel.f198456h;
                    C87412m.m108591d(str4);
                    C97625j3.m125815e().mo123460f(new C45260f(i2, str4));
                    return;
                }
            }
            contactEditLabel.hideLoading();
            C76879j.m92749t(contactEditLabel, contactEditLabel.getString(C0966R.string.f7382eo), "", C58520j.f167556d);
        }
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        return false;
    }

    /* renamed from: I7 */
    public final void mo95080I7() {
        String str = this.f198452d;
        Object[] objArr = new Object[2];
        HashSet<String> hashSet = this.f198464s;
        objArr[0] = Integer.valueOf(hashSet != null ? hashSet.size() : 0);
        HashSet<String> hashSet2 = this.f198466u;
        objArr[1] = Integer.valueOf(hashSet2 != null ? hashSet2.size() : 0);
        Log.m105925i(str, "cpan[doUpdateContactList] addcount:%d,delcount:%d", objArr);
        LinkedList linkedList = new LinkedList();
        HashSet<String> hashSet3 = this.f198464s;
        if (hashSet3 != null && hashSet3.size() > 0) {
            this.f198464s.size();
            Iterator<String> it = this.f198464s.iterator();
            C87412m.m108593f(it, "mAddContactList.iterator()");
            while (it.hasNext()) {
                String next = it.next();
                C87412m.m108592e(next, "null cannot be cast to non-null type kotlin.String");
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(next);
                String r2 = z1Var.mo73974r2();
                String b = C0008d.m1b(r2, this.f198457i);
                Log.m105925i(this.f198452d, "labels:%s mixLabelIds:%s", r2, b);
                if (!C112551y.m153809i(b, r2, true)) {
                    ap4 ap4 = new ap4();
                    ap4.f130717d = z1Var.getUsername();
                    ap4.f130718e = b;
                    linkedList.add(ap4);
                }
            }
        }
        HashSet<String> hashSet4 = this.f198466u;
        if (hashSet4 != null && hashSet4.size() > 0) {
            this.f198466u.size();
            Iterator<String> it4 = this.f198466u.iterator();
            C87412m.m108593f(it4, "mDelContactList.iterator()");
            while (it4.hasNext()) {
                String next2 = it4.next();
                C87412m.m108592e(next2, "null cannot be cast to non-null type kotlin.String");
                String str2 = next2;
                String r25 = C97625j3.m125812b().mo105907v().get(str2).mo73974r2();
                String c = C0008d.m2c(r25, this.f198457i);
                Log.m105925i(this.f198452d, "username:%s labels:%s mixLabelIds:%s", str2, r25, c);
                if (!C112551y.m153809i(c, r25, true)) {
                    ap4 ap42 = new ap4();
                    ap42.f130717d = str2;
                    ap42.f130718e = c;
                    linkedList.add(ap42);
                }
            }
        }
        if (linkedList.size() > 0) {
            C97625j3.m125815e().mo123460f(new C45259e(linkedList));
        } else {
            mo95081J7();
        }
    }

    /* renamed from: J7 */
    public final void mo95081J7() {
        Log.m105924i(this.f198452d, "cpan[savaSuccess]");
        hideLoading();
        HashSet<String> hashSet = this.f198464s;
        int size = hashSet != null ? hashSet.size() : 0;
        HashSet<String> hashSet2 = this.f198466u;
        int size2 = hashSet2 != null ? hashSet2.size() : 0;
        Log.m105925i(this.f198452d, "cpan[doUpdateContactList]addnum:%d", Integer.valueOf(size));
        if (size > 0) {
            int size3 = this.f198465t.size();
            int max = Math.max(0, size - size3);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[7];
            objArr[0] = C75592q0.m90789s();
            objArr[1] = 0;
            objArr[2] = 0;
            objArr[3] = Integer.valueOf(size);
            objArr[4] = Integer.valueOf(this.f198459n ? 1 : 2);
            objArr[5] = Integer.valueOf(size3);
            objArr[6] = Integer.valueOf(max);
            nVar.mo160131h(11220, objArr);
        }
        if (this.f198461p) {
            Intent intent = getIntent();
            intent.putExtra("k_sns_label_add_label", this.f198456h);
            intent.putStringArrayListExtra("k_sns_label_add_label_usernames", new ArrayList(this.f198464s));
            setResult(0, intent);
            if (this.f198469x) {
                C115669n.INSTANCE.mo160131h(16097, 1, 1, 2);
            } else {
                C115669n.INSTANCE.mo160131h(16097, 1, 1, 3);
            }
        } else {
            if (size > 0) {
                if (this.f198469x) {
                    C115669n.INSTANCE.mo160131h(16097, 1, 3, 2);
                } else {
                    C115669n.INSTANCE.mo160131h(16097, 1, 3, 3);
                }
            }
            if (size2 > 0) {
                if (this.f198469x) {
                    C115669n.INSTANCE.mo160131h(16097, 1, 4, 2);
                } else {
                    C115669n.INSTANCE.mo160131h(16097, 1, 4, 3);
                }
            }
            setResult(0);
        }
        finish();
    }

    /* renamed from: K7 */
    public final void mo95082K7() {
        Log.m105924i(this.f198452d, "cpan[saveFailed]");
        hideLoading();
        C76879j.m92749t(this, getString(C0966R.string.f7383ep), "", C58520j.f167556d);
    }

    /* renamed from: f6 */
    public ListView mo7831f6() {
        ListView listView = this.f198471z;
        if (listView != null) {
            return listView;
        }
        C87412m.m108603p("listView");
        throw null;
    }

    public Activity getActivity() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.blu;
    }

    public final void hideLoading() {
        ProgressDialog progressDialog = this.f198467v;
        if (progressDialog != null) {
            C87412m.m108591d(progressDialog);
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.f198467v;
                C87412m.m108591d(progressDialog2);
                progressDialog2.dismiss();
            }
        }
    }

    /* renamed from: n1 */
    public String mo7833n1(C75922b bVar) {
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i(this.f198452d, "cpan[onActivityResult] requestCode:%d resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1 && i == this.f198453e) {
            C87412m.m108591d(intent);
            String stringExtra = intent.getStringExtra("Select_Contact");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            String str = this.f198452d;
            Log.m105925i(str, "cpan[onActivityResult] %s", stringExtra + "");
            if (!Util.isNullOrNil(stringExtra)) {
                C87412m.m108591d(stringExtra);
                Object[] array = C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                ArrayList<String> stringsToList = Util.stringsToList((String[]) array);
                if (stringsToList != null && stringsToList.size() > 0) {
                    int size = stringsToList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str2 = stringsToList.get(i3);
                        if (!Util.isNullOrNil(str2)) {
                            if (!C45628s0.m50740E(str2) || this.f198462q.contains(str2) || C87412m.m108589b(str2, this.f198468w)) {
                                Log.m105925i(this.f198452d, "dz[getIntent] %s is no friend or is user self and just filter", str2);
                            } else {
                                this.f198462q.add(str2);
                                ArrayList<String> arrayList = this.f198463r;
                                if (arrayList != null && !arrayList.contains(stringsToList.get(i3))) {
                                    this.f198464s.add(str2);
                                }
                                if (booleanExtra) {
                                    this.f198465t.add(str2);
                                }
                                HashSet<String> hashSet = this.f198466u;
                                if (hashSet != null && hashSet.contains(str2)) {
                                    this.f198466u.remove(str2);
                                }
                            }
                        }
                    }
                    if (!Util.isNullOrNil(this.f198456h)) {
                        enableOptionMenu(true);
                    }
                }
                MMHandler mMHandler = this.f198451E;
                if (mMHandler != null) {
                    mMHandler.sendEmptyMessage(TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
                }
            }
        }
    }

    public void onBackPressed() {
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        if ((Util.isNullOrNil(this.f198456h) || C87412m.m108589b(this.f198456h, this.f198455g)) && (((hashSet = this.f198464s) == null || hashSet.size() <= 0) && ((hashSet2 = this.f198466u) == null || hashSet2.size() <= 0))) {
            setResult(0);
            finish();
            return;
        }
        C76879j.m92707A(this, getString(C0966R.string.ian), "", getString(C0966R.string.att), getString(C0966R.string.atw), new C75515l(this), new C7592m(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f198468w = C75592q0.m90789s();
        this.f198457i = getIntent().getStringExtra("label_id");
        String stringExtra = getIntent().getStringExtra("label_name");
        this.f198455g = stringExtra;
        if (stringExtra == null || C87412m.m108589b(stringExtra, "")) {
            this.f198455g = " ";
        }
        String stringExtra2 = getIntent().getStringExtra("label_name");
        this.f198456h = stringExtra2;
        if (stringExtra2 == null || C87412m.m108589b(stringExtra2, "")) {
            this.f198456h = " ";
        }
        this.f198459n = getIntent().getBooleanExtra("Is_Chatroom", false);
        String stringExtra3 = getIntent().getStringExtra("label_source");
        this.f198469x = stringExtra3 != null && C112551y.m153810j(stringExtra3, "label_source_Address", false, 2, (Object) null);
        getIntent().getBooleanExtra("is_show_delete", true);
        String stringExtra4 = getIntent().getStringExtra("Select_Contact");
        if (!Util.isNullOrNil(stringExtra4)) {
            C87412m.m108591d(stringExtra4);
            Object[] array = C112550d0.m153785U(stringExtra4, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            ArrayList<String> stringsToList = Util.stringsToList((String[]) array);
            this.f198462q = new ArrayList<>();
            if (stringsToList != null && stringsToList.size() > 0) {
                int size = stringsToList.size();
                for (int i = 0; i < size; i++) {
                    String str = stringsToList.get(i);
                    if (!Util.isNullOrNil(str)) {
                        if (!C45628s0.m50740E(str) || this.f198462q.contains(str) || C87412m.m108589b(str, this.f198468w)) {
                            Log.m105925i(this.f198452d, "dz[getIntent] %s is no friend or is user self and just filter", str);
                        } else {
                            this.f198462q.add(str);
                            this.f198464s.add(str);
                            if (this.f198459n) {
                                this.f198465t.add(str);
                            }
                        }
                    }
                }
            }
        }
        C97625j3.m125815e().mo123455a(C28613b.CTRL_INDEX, this);
        C97625j3.m125815e().mo123455a(637, this);
        C97625j3.m125815e().mo123455a(638, this);
        C86709a0.m107525e().postToWorker(new C75509i(this));
        if (Util.isNullOrNil(this.f198457i)) {
            this.f198461p = true;
            this.f198460o = getString(C0966R.string.hly);
        } else {
            this.f198461p = false;
            this.f198458j = C27740g.vx0().mo100950bF(this.f198457i);
            this.f198460o = getString(C0966R.string.hlx);
        }
        setMMTitle(this.f198460o);
        View findViewById = findViewById(C0966R.C0970id.gri);
        C87412m.m108593f(findViewById, "findViewById(R.id.member_list)");
        this.f198471z = (ListView) findViewById;
        setToTop(new C7586a(this));
        View findViewById2 = findViewById(C0966R.C0970id.cja);
        C87412m.m108593f(findViewById2, "findViewById(R.id.empty_tip_tv)");
        ((TextView) findViewById2).setVisibility(8);
        this.f198447A = new C69040a(this, this);
        if (getIntent().getBooleanExtra(this.f198470y, false)) {
            C69040a aVar = this.f198447A;
            if (aVar != null) {
                aVar.f219057f = true;
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }
        View findViewById3 = findViewById(C0966R.C0970id.gtb);
        C87412m.m108593f(findViewById3, "findViewById(R.id.mgr_footer)");
        ((LinearLayout) findViewById3).setVisibility(8);
        ListView listView = this.f198471z;
        if (listView != null) {
            listView.setOnItemClickListener(new C7587b(this));
            ListView listView2 = this.f198471z;
            if (listView2 != null) {
                listView2.setOnItemLongClickListener(new C75496c(this));
                ListView listView3 = this.f198471z;
                if (listView3 != null) {
                    listView3.setOnTouchListener(new C7588d(this));
                    ListView listView4 = this.f198471z;
                    if (listView4 != null) {
                        C69040a aVar2 = this.f198447A;
                        if (aVar2 != null) {
                            listView4.setAdapter(aVar2);
                            View findViewById4 = findViewById(C0966R.C0970id.grk);
                            C87412m.m108593f(findViewById4, "findViewById(R.id.member_scrollbar)");
                            ((SelectMemberScrollBar) findViewById4).setOnScrollBarTouchListener(new C7589e(this));
                            View findViewById5 = findViewById(C0966R.C0970id.j_b);
                            C87412m.m108593f(findViewById5, "findViewById<MMEditText>(R.id.select_member_et)");
                            EditText editText = (EditText) findViewById5;
                            this.f198450D = editText;
                            editText.addTextChangedListener(new C75502f(this));
                            setBackBtn(new C75505g(this));
                            addTextOptionMenu(0, getString(C0966R.string.bwa), new C75507h(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
                            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
                            return;
                        }
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                    C87412m.m108603p("listView");
                    throw null;
                }
                C87412m.m108603p("listView");
                throw null;
            }
            C87412m.m108603p("listView");
            throw null;
        }
        C87412m.m108603p("listView");
        throw null;
    }

    public void onDestroy() {
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        C97625j3.m125815e().mo123470p(C28613b.CTRL_INDEX, this);
        C97625j3.m125815e().mo123470p(637, this);
        C97625j3.m125815e().mo123470p(638, this);
        C69040a aVar = this.f198447A;
        if (aVar != null) {
            aVar.mo7851i();
            this.f198451E.removeCallbacksAndMessages((Object) null);
            super.onDestroy();
            return;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        C69040a aVar = this.f198447A;
        if (aVar != null) {
            aVar.mo7853r();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    public void onPause() {
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(4, "ContactEditLabel" + getIdentString(), hashCode());
        C97625j3.m125815e().mo123470p(636, this);
        super.onPause();
    }

    public void onResume() {
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(3, "ContactLabelEditUI" + getIdentString(), hashCode());
        C97625j3.m125815e().mo123455a(636, this);
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        Log.m105925i(this.f198452d, "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C87412m.m108591d(yVar);
        switch (yVar.getType()) {
            case C28613b.CTRL_INDEX:
                if (i == 0 && i2 == 0) {
                    C48946c3 c3Var = (C48946c3) ((C75319a) yVar).f221473d.f127056b.f127083a;
                    C87412m.m108593f(c3Var, "addContact.response");
                    LinkedList<C50422mm2> linkedList = c3Var.f131475e;
                    C87412m.m108593f(linkedList, "respone.LabelPairList");
                    if (linkedList.size() > 0) {
                        C50422mm2 mm22 = linkedList.get(0);
                        C87412m.m108593f(mm22, "list[0]");
                        C50422mm2 mm23 = mm22;
                        String str2 = this.f198452d;
                        Log.m105925i(str2, "cpan[onSceneEnd] add label pair.LabelID:%s pair.LabelName:%s", mm23.f138106e + "", mm23.f138105d);
                        this.f198457i = mm23.f138106e + "";
                        mo95080I7();
                        return;
                    }
                    mo95082K7();
                    return;
                }
                mo95082K7();
                return;
            case 636:
                if (i == 0 && i2 == 0) {
                    C72955b2 b2Var = this.f198458j;
                    C72960e2 vx02 = C27740g.vx0();
                    C87412m.m108591d(b2Var);
                    if (!vx02.mo100957qq(true, b2Var, "labelID")) {
                        Log.m105928w(this.f198452d, "cpan[doDeleteContactLabel] fail.");
                        C76879j.m92749t(this, getString(C0966R.string.bxv), "", C58520j.f167556d);
                    } else {
                        setResult(-1);
                        finish();
                    }
                    MMHandler mMHandler = this.f198451E;
                    if (mMHandler != null) {
                        mMHandler.sendEmptyMessageDelayed(6002, 300);
                        return;
                    }
                    return;
                }
                Log.m105928w(this.f198452d, "cpan[onSceneEnd] delete fail.");
                C76879j.m92749t(this, getString(C0966R.string.bxv), "", C58520j.f167556d);
                return;
            case 637:
                if (i == 0 && i2 == 0) {
                    String str3 = this.f198457i;
                    String str4 = this.f198456h;
                    Log.m105924i(this.f198452d, "cpan[doInsertOrUpdateLable]");
                    try {
                        C87412m.m108591d(str3);
                        Integer valueOf = Integer.valueOf(str3);
                        C87412m.m108593f(valueOf, "valueOf(id!!)");
                        i3 = valueOf.intValue();
                    } catch (Exception unused) {
                        String str5 = this.f198452d;
                        Log.m105921e(str5, "id is not integer type:%s", str3 + "");
                        i3 = -1;
                    }
                    if (i3 != -1) {
                        C72955b2 bF = C27740g.vx0().mo100950bF(str3);
                        if (bF == null) {
                            bF = new C72955b2();
                        }
                        bF.field_labelID = i3;
                        bF.field_labelName = str4;
                        bF.field_labelPYFull = C77691f.m93686a(str4);
                        bF.field_labelPYShort = C77691f.m93687b(str4);
                        C27740g.vx0().mo100958uP(true, bF, "labelID");
                    } else {
                        mo95082K7();
                    }
                    mo95080I7();
                    return;
                }
                mo95082K7();
                return;
            case 638:
                if (i == 0 && i2 == 0) {
                    mo95081J7();
                    MMHandler mMHandler2 = this.f198451E;
                    if (mMHandler2 != null) {
                        mMHandler2.sendEmptyMessageDelayed(6002, 300);
                        return;
                    }
                    return;
                }
                mo95082K7();
                return;
            default:
                return;
        }
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        if (!(bVar instanceof C75939h)) {
            return false;
        }
        C69040a aVar = this.f198447A;
        if (aVar != null) {
            return aVar.f198476r.contains(((C75939h) bVar).f222602y);
        }
        C87412m.m108603p("adapter");
        throw null;
    }
}
