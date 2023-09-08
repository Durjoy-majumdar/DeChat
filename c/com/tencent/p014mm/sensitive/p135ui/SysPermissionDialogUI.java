package com.tencent.p014mm.sensitive.p135ui;

import android.os.Build;
import android.os.Bundle;
import bh3.C113177k;
import ch3.C113346a;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import hh3.C117098f;
import in3.C87773e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import nj3.C88989a;
import p918s2.C90111a;
import rx3.C13598b0;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sensitive/ui/SysPermissionDialogUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "sensitive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.sensitive.ui.SysPermissionDialogUI */
public final class SysPermissionDialogUI extends MMActivity {

    /* renamed from: h */
    public static C32228q<? super Integer, ? super String[], ? super int[], C13598b0> f347978h;

    /* renamed from: d */
    public int f347979d;

    /* renamed from: e */
    public ArrayList<C113177k.C113179b> f347980e;

    /* renamed from: f */
    public ArrayList<C113177k.C113179b> f347981f;

    /* renamed from: g */
    public int f347982g = -1;

    /* renamed from: com.tencent.mm.sensitive.ui.SysPermissionDialogUI$a */
    public static final class C116013a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SysPermissionDialogUI f347983d;

        /* renamed from: e */
        public final /* synthetic */ String[] f347984e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116013a(SysPermissionDialogUI sysPermissionDialogUI, String[] strArr) {
            super(1);
            this.f347983d = sysPermissionDialogUI;
            this.f347984e = strArr;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f347983d.getIntent().putExtra("IS_FROM_DELEGATE", true);
                ArrayList<C113177k.C113179b> arrayList = this.f347983d.f347980e;
                if (arrayList != null) {
                    Iterator<C113177k.C113179b> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C117098f.m165127b(C117098f.f350877a, 151, Long.valueOf((long) it.next().f338673e), (Long) null, (Boolean) null, 12, (Object) null);
                    }
                }
                SysPermissionDialogUI sysPermissionDialogUI = this.f347983d;
                C90111a.m112741e(sysPermissionDialogUI, this.f347984e, sysPermissionDialogUI.f347982g);
            } else {
                int length = this.f347984e.length;
                int[] iArr = new int[length];
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = -1;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    C32228q<? super Integer, ? super String[], ? super int[], C13598b0> qVar = SysPermissionDialogUI.f347978h;
                    if (qVar != null) {
                        qVar.invoke(Integer.valueOf(this.f347983d.f347982g), this.f347984e, iArr);
                    }
                    C32228q<? super Integer, ? super String[], ? super int[], C13598b0> qVar2 = SysPermissionDialogUI.f347978h;
                    if (qVar2 != null) {
                        i = qVar2.hashCode();
                    }
                    SysPermissionDialogUI sysPermissionDialogUI2 = this.f347983d;
                    if (i == sysPermissionDialogUI2.f347979d) {
                        SysPermissionDialogUI.f347978h = null;
                    }
                    sysPermissionDialogUI2.finish();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sensitive.ui.SysPermissionDialogUI$b */
    public static final class C116014b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C113177k.C113179b f347985d;

        /* renamed from: e */
        public final /* synthetic */ SysPermissionDialogUI f347986e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f347987f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116014b(C113177k.C113179b bVar, SysPermissionDialogUI sysPermissionDialogUI, C32226l<? super Boolean, C13598b0> lVar) {
            super(1);
            this.f347985d = bVar;
            this.f347986e = sysPermissionDialogUI;
            this.f347987f = lVar;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            if (((Boolean) obj).booleanValue()) {
                C117098f.m165127b(C117098f.f350877a, 102, Long.valueOf((long) this.f347985d.f338673e), (Long) null, (Boolean) null, 12, (Object) null);
                ArrayList<C113177k.C113179b> arrayList = this.f347986e.f347981f;
                C87412m.m108591d(arrayList);
                arrayList.remove(this.f347985d);
                ArrayList<C113177k.C113179b> arrayList2 = this.f347986e.f347981f;
                C87412m.m108591d(arrayList2);
                C113177k.C113179b bVar = (C113177k.C113179b) C110818d0.m150916N(arrayList2);
                if (bVar != null) {
                    this.f347986e.mo176862H7(bVar, this.f347987f);
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    this.f347987f.invoke(Boolean.TRUE);
                }
            } else {
                this.f347987f.invoke(Boolean.FALSE);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: H7 */
    public final void mo176862H7(C113177k.C113179b bVar, C32226l<? super Boolean, C13598b0> lVar) {
        C117098f.m165127b(C117098f.f350877a, 101, Long.valueOf((long) bVar.f338673e), (Long) null, (Boolean) null, 12, (Object) null);
        PermissionSwitchCheckUtil permissionSwitchCheckUtil = PermissionSwitchCheckUtil.f347926a;
        int i = this.f347982g;
        permissionSwitchCheckUtil.mo176854k(this, bVar, (i == 1001 || i == 1002) ? C113177k.C113178a.OLYMPIC : null, new C116014b(bVar, this, lVar));
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        String[] strArr;
        super.onCreate(bundle);
        int i = getContext().getResources().getConfiguration().orientation;
        C87773e.m109211d(getWindow());
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PERMISSION_LIST");
        int i2 = 0;
        C13598b0 b0Var = null;
        if (stringArrayListExtra != null) {
            Object[] array = stringArrayListExtra.toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            strArr = (String[]) array;
        } else {
            strArr = null;
        }
        this.f347982g = getIntent().getIntExtra("KEY_PERMISSION_REQUEST_CODE", -1);
        if (strArr != null) {
            this.f347980e = new ArrayList<>();
            for (String str : strArr) {
                HashMap<C113177k.C113179b, C113346a.C113347b> hashMap = C113346a.f339121a;
                C113177k.C113179b bVar = C113346a.f339122b.get(str);
                if (bVar != null) {
                    ArrayList<C113177k.C113179b> arrayList = this.f347980e;
                    C87412m.m108591d(arrayList);
                    if (!(true ^ arrayList.contains(bVar))) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        ArrayList<C113177k.C113179b> arrayList2 = this.f347980e;
                        C87412m.m108591d(arrayList2);
                        arrayList2.add(bVar);
                    }
                }
            }
            ArrayList<C113177k.C113179b> arrayList3 = new ArrayList<>();
            ArrayList<C113177k.C113179b> arrayList4 = this.f347980e;
            C87412m.m108591d(arrayList4);
            arrayList3.addAll(arrayList4);
            this.f347981f = arrayList3;
            C32228q<? super Integer, ? super String[], ? super int[], C13598b0> qVar = f347978h;
            if (qVar != null) {
                i2 = qVar.hashCode();
            }
            this.f347979d = i2;
            ArrayList<C113177k.C113179b> arrayList5 = this.f347981f;
            C87412m.m108591d(arrayList5);
            if (!(!arrayList5.isEmpty())) {
                arrayList5 = null;
            }
            if (arrayList5 != null) {
                mo176862H7((C113177k.C113179b) C110818d0.m150914L(arrayList5), new C116013a(this, strArr));
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                getIntent().putExtra("IS_FROM_DELEGATE", true);
                ArrayList<C113177k.C113179b> arrayList6 = this.f347980e;
                if (arrayList6 != null) {
                    for (C113177k.C113179b bVar2 : arrayList6) {
                        C117098f.m165127b(C117098f.f350877a, 151, Long.valueOf((long) bVar2.f338673e), (Long) null, (Boolean) null, 12, (Object) null);
                    }
                }
                C90111a.m112741e(this, strArr, this.f347982g);
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            finish();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        HashMap<C113177k.C113178a, C113346a.C54729a> hashMap;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        C87412m.m108594g(strArr2, "permissions");
        C87412m.m108594g(iArr2, "grantResults");
        int length = iArr2.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr2[i3];
            int i6 = i4 + 1;
            HashMap<C113177k.C113179b, C113346a.C113347b> hashMap2 = C113346a.f339121a;
            C113177k.C113179b bVar = C113346a.f339122b.get(strArr2[i4]);
            if (bVar != null) {
                if (iArr2[i4] != -1) {
                    C113346a.C113347b bVar2 = C113346a.f339121a.get(bVar);
                    if (!(bVar2 == null || (hashMap = bVar2.f339127c) == null)) {
                        for (Map.Entry next : hashMap.entrySet()) {
                            C113177k kVar = (C113177k) C86312j.m106911c(C113177k.class);
                            kVar.mo165721yX(bVar.f338672d, ((C113177k.C113178a) next.getKey()).f338661d, !kVar.ad0(bVar, (C113177k.C113178a) next.getKey()));
                        }
                    }
                    C117098f.m165127b(C117098f.f350877a, 162, Long.valueOf((long) bVar.f338673e), (Long) null, Boolean.TRUE, 4, (Object) null);
                } else if (C90111a.m112742f(getContext(), strArr2[i4])) {
                    C117098f.m165127b(C117098f.f350877a, 163, Long.valueOf((long) bVar.f338673e), (Long) null, Boolean.TRUE, 4, (Object) null);
                } else {
                    C117098f.m165127b(C117098f.f350877a, 164, Long.valueOf((long) bVar.f338673e), (Long) null, Boolean.TRUE, 4, (Object) null);
                }
            }
            i3++;
            i4 = i6;
        }
        finish();
        C32228q<? super Integer, ? super String[], ? super int[], C13598b0> qVar = f347978h;
        if (qVar != null) {
            qVar.invoke(Integer.valueOf(i), strArr2, iArr2);
        }
        C32228q<? super Integer, ? super String[], ? super int[], C13598b0> qVar2 = f347978h;
        if (qVar2 != null) {
            i2 = qVar2.hashCode();
        }
        if (i2 == this.f347979d) {
            f347978h = null;
        }
    }
}
