package com.tencent.p014mm.sensitive.p135ui;

import android.os.Bundle;
import bh3.C113177k;
import com.tencent.p014mm.p136ui.MMActivity;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;
import nj3.C88989a;
import p206nj.C11171e;
import rx3.C13598b0;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sensitive/ui/PermissionDialogUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "sensitive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.sensitive.ui.PermissionDialogUI */
public final class PermissionDialogUI extends MMActivity {

    /* renamed from: d */
    public static C32226l<? super Boolean, C13598b0> f318526d;

    /* renamed from: com.tencent.mm.sensitive.ui.PermissionDialogUI$a */
    public static final class C106597a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ PermissionDialogUI f318527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106597a(PermissionDialogUI permissionDialogUI) {
            super(1);
            this.f318527d = permissionDialogUI;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f318527d.finish();
            C32226l<? super Boolean, C13598b0> lVar = PermissionDialogUI.f318526d;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(booleanValue));
            }
            PermissionDialogUI.f318526d = null;
            return C13598b0.f38549a;
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        C113177k.C113179b bVar;
        C113177k.C113178a aVar;
        C13598b0 b0Var;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        int i = 0;
        if (C11171e.m11046c(21)) {
            getWindow().setStatusBarColor(0);
        }
        String stringExtra = getIntent().getStringExtra("KEY_PERMISSION");
        if (stringExtra != null) {
            try {
                C113177k.C113179b[] values = C113177k.C113179b.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    bVar = values[i2];
                    if (C112551y.m153809i(bVar.f338672d, stringExtra, true)) {
                        break;
                    }
                    i2++;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        bVar = null;
        String stringExtra2 = getIntent().getStringExtra("KEY_BUSINESS");
        if (stringExtra2 != null) {
            try {
                C113177k.C113178a[] values2 = C113177k.C113178a.values();
                int length2 = values2.length;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    aVar = values2[i];
                    if (C112551y.m153809i(aVar.f338661d, stringExtra2, true)) {
                        break;
                    }
                    i++;
                }
            } catch (IllegalArgumentException unused2) {
            }
        }
        aVar = null;
        if (bVar == null || aVar == null) {
            b0Var = null;
        } else {
            PermissionSwitchCheckUtil.f347926a.mo176852i(this, bVar, aVar, new C106597a(this));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            f318526d = null;
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C32226l<? super Boolean, C13598b0> lVar = f318526d;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
        f318526d = null;
    }
}
