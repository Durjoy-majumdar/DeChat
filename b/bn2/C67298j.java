package bn2;

import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.plugin.setting.p102ui.fixtools.FixToolsUplogUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bn2.j */
public class C67298j implements C7045j.C7056k {

    /* renamed from: a */
    public final /* synthetic */ boolean f193138a;

    /* renamed from: b */
    public final /* synthetic */ C7045j f193139b;

    /* renamed from: c */
    public final /* synthetic */ FixToolsUplogUI f193140c;

    public C67298j(FixToolsUplogUI fixToolsUplogUI, boolean z, C7045j jVar) {
        this.f193140c = fixToolsUplogUI;
        this.f193138a = z;
        this.f193139b = jVar;
    }

    public void onResult(boolean z, Object obj, Object obj2) {
        Log.m105925i("MicroMsg.FixToolsUplogUI", "Picked hour: %s, %s, %s, %s", Boolean.valueOf(z), obj, obj2, Boolean.valueOf(this.f193138a));
        if (z) {
            boolean z2 = this.f193138a;
            if (z2) {
                FixToolsUplogUI.f205603t = (String) obj;
            } else {
                FixToolsUplogUI.f205604u = (String) obj;
            }
            FixToolsUplogUI fixToolsUplogUI = this.f193140c;
            int indexOf = fixToolsUplogUI.f205614q.indexOf(FixToolsUplogUI.f205603t);
            int indexOf2 = fixToolsUplogUI.f205615r.indexOf(FixToolsUplogUI.f205604u);
            if (indexOf < 0 || indexOf2 < 0) {
                Log.m105921e("MicroMsg.FixToolsUplogUI", "index of hours < 0! %s, %s", Integer.valueOf(indexOf), Integer.valueOf(indexOf2));
            }
            if (indexOf > indexOf2) {
                if (z2) {
                    FixToolsUplogUI.f205604u = fixToolsUplogUI.f205615r.get(indexOf);
                } else {
                    FixToolsUplogUI.f205603t = fixToolsUplogUI.f205614q.get(indexOf2);
                }
            }
            this.f193140c.f205610j.setText(FixToolsUplogUI.f205603t);
            this.f193140c.f205611n.setText(FixToolsUplogUI.f205604u);
        }
        this.f193139b.mo8101d();
    }
}
