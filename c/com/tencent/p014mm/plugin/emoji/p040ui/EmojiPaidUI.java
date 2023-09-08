package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C41053r;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiBaseActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import j61.C46439j;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p910lj.C76701a;
import w51.C102332d;
import x51.C102553a;
import x51.C102554b;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI */
public class EmojiPaidUI extends BaseEmojiStoreUI {

    /* renamed from: K */
    public static final /* synthetic */ int f268517K = 0;

    /* renamed from: I */
    public float f268518I;

    /* renamed from: J */
    public float f268519J;

    /* renamed from: J7 */
    public void mo127641J7(C46439j jVar) {
    }

    /* renamed from: M7 */
    public void mo127644M7(boolean z, C41053r rVar, boolean z2, boolean z3) {
        C102554b bVar;
        if (!(rVar == null || !z || (bVar = this.f268288j) == null)) {
            MMHandlerThread.postToMainThread(new C102553a(bVar, rVar));
        }
        if (this.f268288j == null || rVar == null || rVar.f110539a <= 0) {
            View view = this.f268290o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268291p.setText(C0966R.string.c6o);
            this.f268287i.setVisibility(8);
            return;
        }
        View view3 = this.f268290o;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "updateView", "(Lcom/tencent/mm/plugin/emoji/model/EmotionListReqModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f268287i.setVisibility(0);
    }

    /* renamed from: N7 */
    public int mo127645N7() {
        return 10;
    }

    /* renamed from: Q7 */
    public int mo127648Q7(byte[] bArr) {
        return this.f268299x;
    }

    /* renamed from: R7 */
    public int mo127649R7() {
        return 2;
    }

    /* renamed from: S7 */
    public int mo127650S7() {
        return 6;
    }

    /* renamed from: X7 */
    public void mo127655X7() {
    }

    /* renamed from: a8 */
    public C102554b mo127658a8() {
        return new C102332d(getContext());
    }

    public void initView() {
        setMMTitle((int) C0966R.string.c6r);
        if (C75592q0.m90796z()) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new EmojiPaidUI$$g(this));
        }
        super.initView();
        View view = this.f268290o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f268287i.setVisibility(8);
        this.f268287i.setOnItemLongClickListener(new EmojiPaidUI$$a(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        int i3;
        Log.m105924i("MicroMsg.emoji.EmojiPaidUI", "onActivityResult . requestCode:" + i + "  resultCode:" + i2);
        mo127643L7();
        if (intent != null) {
            i3 = intent.getIntExtra("key_err_code", 0);
            Log.m105928w("MicroMsg.emoji.EmojiPaidUI", "errCode:" + i3);
            str = intent.getStringExtra("key_err_msg");
            Log.m105928w("MicroMsg.emoji.EmojiPaidUI", "errMsg:" + str);
        } else {
            str = "";
            i3 = 0;
        }
        if (i2 != -1) {
            C76701a.makeText((Context) this, (int) C0966R.string.c7f, 0).show();
        } else if (intent == null || i3 != 0) {
            C76701a.makeText((Context) this, (CharSequence) str, 0).show();
        } else {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
            if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                C76701a.makeText((Context) this, (CharSequence) str, 0).show();
                return;
            }
            this.f268296u = null;
            this.f268293r = -1;
            mo127662e8(false, false);
            C86709a0.m107535s().mo121142i().mo119676J(208900, Boolean.TRUE);
            C76701a.makeText((Context) this, (int) C0966R.string.c7g, 0).show();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C115669n.INSTANCE.mo160131h(12740, 4, "", "", "", 10, 10);
        this.f268287i.setOnTouchListener(new EmojiPaidUI$$f(this));
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (str != null && str.equals("event_update_group")) {
            EmojiBaseActivity.C93130b bVar = this.f268408e;
            if (bVar != null) {
                bVar.removeMessages(131074);
            }
            EmojiBaseActivity.C93130b bVar2 = this.f268408e;
            if (bVar2 != null) {
                bVar2.sendEmptyMessageDelayed(131074, (long) 50);
            }
        }
    }
}
