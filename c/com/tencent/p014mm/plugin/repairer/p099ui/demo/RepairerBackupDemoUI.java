package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import bj2.C104158x;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import java.util.ArrayList;
import jj2.C33585b;
import jj2.C98944a;
import kotlin.Metadata;
import p175j0.C108504h;
import p415q0.C110261c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerBackupDemoUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerBackupDemoUI */
public final class RepairerBackupDemoUI extends MMComposeActivity {

    /* renamed from: d */
    public final String f315714d = "MicroMsg.Repairer.RepairerBackupDemoUI";

    /* renamed from: e */
    public final int f315715e = 50;

    /* renamed from: f */
    public ArrayList<C98944a> f315716f;

    /* renamed from: g */
    public final C33585b f315717g = new C33585b();

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerBackupDemoUI$a */
    public static final class C106056a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RepairerBackupDemoUI f315718d;

        /* renamed from: e */
        public final /* synthetic */ MMComposeView f315719e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106056a(RepairerBackupDemoUI repairerBackupDemoUI, MMComposeView mMComposeView) {
            super(2);
            this.f315718d = repairerBackupDemoUI;
            this.f315719e = mMComposeView;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C104158x.m138991a(C110261c.m149878b(hVar, 403678238, true, new C106059g(this.f315718d, this.f315719e)), hVar, 6);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerBackupDemoUI$b */
    public static final class C106057b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerBackupDemoUI f315720d;

        public C106057b(RepairerBackupDemoUI repairerBackupDemoUI) {
            this.f315720d = repairerBackupDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f315720d.onBackPressed();
            return true;
        }
    }

    public int getLayoutId() {
        return 1;
    }

    public View getLayoutView() {
        MMComposeView mMComposeView = new MMComposeView(this, (AttributeSet) null, 2, (C8480h) null);
        mMComposeView.setContent(C110261c.m149879c(130794570, true, new C106056a(this, mMComposeView)));
        return mMComposeView;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("聊天迁移");
        setBackBtn(new C106057b(this));
    }
}
