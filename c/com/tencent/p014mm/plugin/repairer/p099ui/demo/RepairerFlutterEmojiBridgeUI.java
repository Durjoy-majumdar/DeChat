package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import a70.C112760b;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p008bq.C28399y0;
import p008bq.C92292x0;
import p220pr.C100835h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI */
public final class RepairerFlutterEmojiBridgeUI extends BaseRepairerUI {

    /* renamed from: d */
    public final Map<String, Object> f273088d = new LinkedHashMap();

    /* renamed from: e */
    public final String f273089e = "MicroMsg.RepairerFlutterEmojiBridgeUI";

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI$a */
    public static final class C94446a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerFlutterEmojiBridgeUI f273090d;

        public C94446a(RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI) {
            this.f273090d = repairerFlutterEmojiBridgeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f273090d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI$b */
    public static final class C94447b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerFlutterEmojiBridgeUI f273091d;

        public C94447b(RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI) {
            this.f273091d = repairerFlutterEmojiBridgeUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI = this.f273091d;
            ((C100835h) C86312j.m106911c(C100835h.class)).mo140310TL(repairerFlutterEmojiBridgeUI, "flutter_emoji", repairerFlutterEmojiBridgeUI.f273088d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI$c */
    public static final class C94448c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerFlutterEmojiBridgeUI f273092d;

        public C94448c(RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI) {
            this.f273092d = repairerFlutterEmojiBridgeUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI = this.f273092d;
            repairerFlutterEmojiBridgeUI.getClass();
            ArrayList<? extends IEmojiInfo> bY = ((C28399y0) C86312j.m106911c(C28399y0.class)).mo55758bY();
            if (bY.size() > 0) {
                int size = bY.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    IEmojiInfo iEmojiInfo = (IEmojiInfo) bY.get(i);
                    byte[] A2 = ((C92292x0) C86312j.m106911c(C92292x0.class)).Um0().mo126270A2(iEmojiInfo);
                    if (ImgUtil.isWXGF(A2) && A2 != null) {
                        if (!(A2.length == 0)) {
                            String str = C112760b.m154231g() + "emoji/temp/decrypt/";
                            C86013q1.m106461v(str);
                            String str2 = str + iEmojiInfo.getMd5();
                            C86013q1.m106440a(str2, A2);
                            repairerFlutterEmojiBridgeUI.f273088d.put("EmojiText", str2);
                            Toast.makeText(repairerFlutterEmojiBridgeUI, "decrypt first WXAM success, path:" + str2, 0).show();
                            Log.m105924i(repairerFlutterEmojiBridgeUI.f273089e, "decrypt success, path:" + str2);
                            break;
                        }
                    }
                    i++;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.crc;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f273088d.put("EmojiText", "Emoji [微笑][666] Test");
        setMMTitle("Flutter Emoji Example调试入口");
        setBackBtn(new C94446a(this));
        ((Button) findViewById(C0966R.C0970id.ck6)).setOnClickListener(new C94447b(this));
        ((Button) findViewById(C0966R.C0970id.f357832kb1)).setOnClickListener(new C94448c(this));
    }
}
