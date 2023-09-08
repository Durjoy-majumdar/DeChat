package jz1;

import android.widget.AdapterView;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.z3$$g;

/* renamed from: jz1.h */
public final class C46604h implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ boolean f125515d;

    /* renamed from: e */
    public final /* synthetic */ AdapterView.AdapterContextMenuInfo f125516e;

    public C46604h(boolean z, AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
        this.f125515d = z;
        this.f125516e = adapterContextMenuInfo;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return false;
    }

    /* renamed from: c */
    public void mo24604c() {
        Log.m105924i("GameLife.ConversationOnLongClickListener", "longclick delete msg finish [CONTEXT_MENU_LONG_CLICK_DELETE] ret=" + this.f125515d + " position=" + this.f125516e.position);
    }
}
