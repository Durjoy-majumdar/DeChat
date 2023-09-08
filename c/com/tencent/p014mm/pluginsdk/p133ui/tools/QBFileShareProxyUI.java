package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import kotlin.Metadata;
import nj3.C88989a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/QBFileShareProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI */
public final class QBFileShareProxyUI extends MMActivity {

    /* renamed from: d */
    public final C13601g f347799d = C36568h.m40985a(new C115921e(this));

    /* renamed from: e */
    public final C13601g f347800e = C36568h.m40985a(new C115918b(this));

    /* renamed from: f */
    public final C13601g f347801f = C36568h.m40985a(new C115919c(this));

    /* renamed from: g */
    public final C13601g f347802g = C36568h.m40985a(new C115917a(this));

    /* renamed from: h */
    public final C13601g f347803h = C36568h.m40985a(new C115920d(this));

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI$a */
    public static final class C115917a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ QBFileShareProxyUI f347804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115917a(QBFileShareProxyUI qBFileShareProxyUI) {
            super(0);
            this.f347804d = qBFileShareProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f347804d.getIntent().getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_EXT);
            if (stringExtra != null) {
                return stringExtra;
            }
            Log.m105920e("MicroMsg.QBFileShareProxyUI", "fileExt null?");
            return "";
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI$b */
    public static final class C115918b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ QBFileShareProxyUI f347805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115918b(QBFileShareProxyUI qBFileShareProxyUI) {
            super(0);
            this.f347805d = qBFileShareProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f347805d.getIntent().getStringExtra("file_name");
            if (stringExtra != null) {
                return stringExtra;
            }
            Log.m105920e("MicroMsg.QBFileShareProxyUI", "fileName null?");
            return "";
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI$c */
    public static final class C115919c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ QBFileShareProxyUI f347806d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115919c(QBFileShareProxyUI qBFileShareProxyUI) {
            super(0);
            this.f347806d = qBFileShareProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f347806d.getIntent().getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH);
            if (stringExtra != null) {
                return stringExtra;
            }
            Log.m105920e("MicroMsg.QBFileShareProxyUI", "filePath null?");
            return "";
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI$d */
    public static final class C115920d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ QBFileShareProxyUI f347807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115920d(QBFileShareProxyUI qBFileShareProxyUI) {
            super(0);
            this.f347807d = qBFileShareProxyUI;
        }

        public Object invoke() {
            return Long.valueOf(this.f347807d.getIntent().getLongExtra("forward_msgid", 0));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI$e */
    public static final class C115921e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ QBFileShareProxyUI f347808d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115921e(QBFileShareProxyUI qBFileShareProxyUI) {
            super(0);
            this.f347808d = qBFileShareProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f347808d.getIntent().getStringExtra("to_user");
            if (stringExtra != null) {
                return stringExtra;
            }
            Log.m105920e("MicroMsg.QBFileShareProxyUI", "username null?");
            return "";
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        String string = getContext().getString(C0966R.string.a2s);
        C87412m.m108593f(string, "context.getString(com.te…ibmmui.R.string.app_send)");
        ((C60200t1) C86312j.m106911c(C60200t1.class)).Tp0(context, (String) ((C36570n) this.f347799d).getValue(), getContext().getString(C0966R.string.f8007z3) + ((String) ((C36570n) this.f347800e).getValue()), true, string, new C115922l1(this), new C115924m1(this));
    }
}
