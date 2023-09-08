package o62;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;

/* renamed from: o62.e */
public abstract class C11375e {

    /* renamed from: d */
    public WeakReference<C11378c> f33501d = null;

    /* renamed from: o62.e$a */
    public class C11376a implements C7241k.C7246e {
        public C11376a() {
        }

        /* renamed from: G4 */
        public CharSequence mo8420G4(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
            String string = bundle.getString("conv_talker_username", "");
            if (map == null) {
                Log.m105928w("MicroMsg.SysMsgTemp.SysMsgTemplateLinkHandlerBase", "hy: non map!!");
                return null;
            } else if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.SysMsgTemp.SysMsgTemplateLinkHandlerBase", "hy: non header!!");
                return null;
            } else if (!Util.isNullOrNil(string)) {
                return C11375e.this.mo11239c(map, str, bundle, weakReference, weakReference2);
            } else {
                Log.m105928w("MicroMsg.SysMsgTemp.SysMsgTemplateLinkHandlerBase", "hy: not resolved talker!!");
                return null;
            }
        }
    }

    /* renamed from: o62.e$b */
    public class C11377b {

        /* renamed from: a */
        public String f33503a;

        /* renamed from: b */
        public String f33504b;

        public C11377b(C11375e eVar) {
        }
    }

    /* renamed from: o62.e$c */
    public interface C11378c {
        /* renamed from: I */
        void mo11394I(View view, C11377b bVar);

        /* renamed from: t2 */
        void mo11395t2(long j, LinkedList<String> linkedList, int i);
    }

    public C11375e(C11378c cVar) {
        Assert.assertNotNull(cVar);
        this.f33501d = new WeakReference<>(cVar);
        ((C7241k) C86312j.m106911c(C7241k.class)).mo8410gZ(mo11238b(), new C11376a());
    }

    /* renamed from: b */
    public abstract String mo11238b();

    /* renamed from: c */
    public abstract CharSequence mo11239c(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2);

    /* renamed from: d */
    public void mo11240d() {
        ((C7241k) C86312j.m106911c(C7241k.class)).z60(mo11238b());
    }
}
