package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import be0.C16790h;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper;
import com.tencent.p014mm.msgsubscription.p017ui.BizSubscribeMsgManagerUI;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import jp3.C9486a;
import jp3.C9487b;
import ke3.C88144b;
import nj3.C76912y0;
import rd0.C22222c;
import rd0.C22226d;
import rd0.C22227f;
import rd0.C48018e;
import rx3.C13598b0;
import tb0.C22474a;
import vd0.C22739d;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.g5 */
public class C19768g5 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f56228d;

    /* renamed from: e */
    public final /* synthetic */ boolean f56229e;

    /* renamed from: f */
    public final /* synthetic */ ChattingItemDyeingTemplate f56230f;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.g5$a */
    public class C19769a implements MMFragmentActivity$$f {

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.g5$a$a */
        public class C19770a implements C32226l<SubscribeMsgRequestResult, C13598b0> {
            public C19770a() {
            }

            public Object invoke(Object obj) {
                SubscribeMsgRequestResult subscribeMsgRequestResult = (SubscribeMsgRequestResult) obj;
                ChattingItemDyeingTemplate chattingItemDyeingTemplate = C19768g5.this.f56230f;
                String str = ChattingItemDyeingTemplate.f216840y0;
                chattingItemDyeingTemplate.getClass();
                MMHandlerThread.postToMainThread(new C19776i5(chattingItemDyeingTemplate));
                if (subscribeMsgRequestResult == null) {
                    C76912y0.makeText((Context) C19768g5.this.f56230f.f216867v.mo91565f(), (CharSequence) C19768g5.this.f56230f.f216867v.mo91565f().getString(C0966R.string.hdl), 1).show();
                    return null;
                }
                MMHandlerThread.postToMainThread(new C19766f5(this, subscribeMsgRequestResult));
                return null;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.g5$a$b */
        public class C19771b implements C22226d {
            public C19771b() {
            }

            /* renamed from: a */
            public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
                Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "alvinluo updateSubscribeMsgList success");
                ChattingItemDyeingTemplate chattingItemDyeingTemplate = C19768g5.this.f56230f;
                String str2 = ChattingItemDyeingTemplate.f216840y0;
                chattingItemDyeingTemplate.getClass();
                MMHandlerThread.postToMainThread(new C19776i5(chattingItemDyeingTemplate));
                C67391b bVar = C19768g5.this.f56230f.f216867v;
                if (bVar != null) {
                    bVar.mo91540A();
                }
            }

            /* renamed from: e */
            public void mo26258e(int i, int i2, String str) {
                Log.m105921e("MicroMsg.ChattingItemDyeingTemplate", "alvinluo updateSubscribeMsgList onError errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                ChattingItemDyeingTemplate chattingItemDyeingTemplate = C19768g5.this.f56230f;
                String str2 = ChattingItemDyeingTemplate.f216840y0;
                chattingItemDyeingTemplate.getClass();
                MMHandlerThread.postToMainThread(new C19776i5(chattingItemDyeingTemplate));
                C76912y0.makeText((Context) C19768g5.this.f56230f.f216867v.mo91565f(), (CharSequence) C19768g5.this.f56230f.f216867v.mo91565f().getString(C0966R.string.hdl), 1).show();
            }
        }

        public C19769a() {
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == 100 && intent != null) {
                SubscribeMsgSettingData subscribeMsgSettingData = (SubscribeMsgSettingData) intent.getParcelableExtra("key_biz_data");
                if (subscribeMsgSettingData != null) {
                    ChattingItemDyeingTemplate chattingItemDyeingTemplate = C19768g5.this.f56230f;
                    String str = ChattingItemDyeingTemplate.f216840y0;
                    chattingItemDyeingTemplate.getClass();
                    MMHandlerThread.postToMainThread(new C19773h5(chattingItemDyeingTemplate));
                    C16790h hVar = C16790h.f45352a;
                    String str2 = C19768g5.this.f56228d;
                    C19770a aVar = new C19770a();
                    C87412m.m108594g(str2, "userName");
                    hVar.mo17819a(str2, subscribeMsgSettingData, (C9487b<? super C9486a>) null, aVar);
                }
            } else if (i == 101 && intent != null) {
                boolean booleanExtra = intent.getBooleanExtra("key_need_update", false);
                Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "alvinluo back from SubscribeMsgManagerUI needUpdate: %b", Boolean.valueOf(booleanExtra));
                if (booleanExtra) {
                    ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = (ISubscribeMsgService$Companion$SubscribeMsgListWrapper) intent.getParcelableExtra("key_biz_data");
                    C22222c a = C48018e.f128802a.mo72802a("name_biz");
                    if (iSubscribeMsgService$Companion$SubscribeMsgListWrapper != null && a != null) {
                        ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = C19768g5.this.f56230f;
                        String str3 = ChattingItemDyeingTemplate.f216840y0;
                        chattingItemDyeingTemplate2.getClass();
                        MMHandlerThread.postToMainThread(new C19773h5(chattingItemDyeingTemplate2));
                        C22227f fVar = new C22227f();
                        String nullAs = Util.nullAs(C19768g5.this.f56228d, "");
                        C87412m.m108594g(nullAs, "<set-?>");
                        fVar.f62967a = nullAs;
                        ((ArrayList) fVar.f62969c).addAll(iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f49048d);
                        fVar.f62970d = iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f49049e;
                        fVar.f62975i = new C19771b();
                        a.mo35370k(fVar);
                    }
                }
            }
        }
    }

    public C19768g5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, String str, boolean z) {
        this.f56230f = chattingItemDyeingTemplate;
        this.f56228d = str;
        this.f56229e = z;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f56230f.f216867v.mo91565f(), BizSubscribeMsgManagerUI.class);
        intent.putExtra("key_biz_username", this.f56228d);
        intent.putExtra("key_biz_nickname", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f56228d));
        if (this.f56229e) {
            intent.putExtra("key_biz_presenter_class", C22739d.class.getName());
        } else {
            intent.putExtra("key_biz_presenter_class", C22474a.class.getName());
            intent.putExtra("key_need_update", false);
            intent.putExtra("key_need_load_from_remote", true);
            intent.putExtra("key_enter_scene", 2);
        }
        C88144b.m109804v((MMFragmentActivity) this.f56230f.f216867v.mo91565f(), "com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI", intent, this.f56229e ? 100 : 101, new C19769a());
    }
}
