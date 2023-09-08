package y90;

import a14.C0000n0;
import android.content.Intent;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.LinkedList;
import kotlin.ResultKt;
import mp3.C88819d;
import ob0.C89132b;
import q40.C89456b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51116rj1;
import te3.C51253sj1;
import te3.C52271zj0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$fetchEventInfo$1", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {360}, mo125471m = "invokeSuspend")
/* renamed from: y90.d */
public final class C15939d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f42820d;

    /* renamed from: e */
    public final /* synthetic */ String f42821e;

    /* renamed from: f */
    public final /* synthetic */ String f42822f;

    /* renamed from: g */
    public final /* synthetic */ Intent f42823g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15939d(String str, String str2, Intent intent, C15601d<? super C15939d> dVar) {
        super(2, dVar);
        this.f42821e = str;
        this.f42822f = str2;
        this.f42823g = intent;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15939d(this.f42821e, this.f42822f, this.f42823g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15939d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C52271zj0 zj02;
        String str;
        String str2;
        String str3;
        String str4;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f42820d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C51116rj1 rj12 = new C51116rj1();
            String str5 = this.f42821e;
            String str6 = this.f42822f;
            rj12.f140941h = str5;
            rj12.f140942i = str6;
            C89132b<C51253sj1> b = rj12.mo73354b();
            this.f42820d = 1;
            obj = C89456b.m111831a(b, 0, (C88819d) null, this, 3, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Intent intent = this.f42823g;
        LinkedList<C52271zj0> linkedList = ((C51253sj1) obj).f141556e;
        C13598b0 b0Var = null;
        if (!(linkedList == null || (zj02 = (C52271zj0) C110818d0.m150916N(linkedList)) == null)) {
            if (!(zj02.f146017s != 1)) {
                zj02 = null;
            }
            if (zj02 != null) {
                FinderContact finderContact = zj02.f146006e;
                intent.putExtra("key_topic_id", zj02.f146005d);
                intent.putExtra("key_activity_type", 102);
                String str7 = "";
                if (finderContact == null || (str = finderContact.username) == null) {
                    str = str7;
                }
                intent.putExtra("key_user_name", str);
                if (finderContact == null || (str2 = finderContact.nickname) == null) {
                    str2 = str7;
                }
                intent.putExtra("key_nick_name", str2);
                if (finderContact == null || (str3 = finderContact.headUrl) == null) {
                    str3 = str7;
                }
                intent.putExtra("key_avatar_url", str3);
                String str8 = zj02.f146010i;
                if (str8 == null) {
                    str8 = str7;
                }
                intent.putExtra("key_cover_url", str8);
                intent.putExtra("key_activity_display_mask", zj02.f146022x);
                String str9 = zj02.f146007f;
                if (str9 == null) {
                    str9 = str7;
                }
                intent.putExtra("key_activity_name", str9);
                String str10 = zj02.f146008g;
                if (str10 == null) {
                    str10 = str7;
                }
                intent.putExtra("key_activity_desc", str10);
                intent.putExtra("key_activity_end_time", zj02.f146018t);
                intent.putExtra("saveActivity", true);
                StringBuilder sb = new StringBuilder();
                sb.append("eventInfo nickname = ");
                if (finderContact == null || (str4 = finderContact.nickname) == null) {
                    str4 = str7;
                }
                sb.append(str4);
                Log.m105924i("MaasBaseUILogicUIC", sb.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("eventInfo eventname = ");
                String str11 = zj02.f146007f;
                if (str11 == null) {
                    str11 = str7;
                }
                sb4.append(str11);
                Log.m105924i("MaasBaseUILogicUIC", sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append("eventInfo description = ");
                String str12 = zj02.f146008g;
                if (str12 != null) {
                    str7 = str12;
                }
                sb5.append(str7);
                Log.m105924i("MaasBaseUILogicUIC", sb5.toString());
                b0Var = C13598b0.f38549a;
            }
        }
        if (b0Var == null) {
            Log.m105928w("MaasBaseUILogicUIC", "activity closed or get error");
        }
        return C13598b0.f38549a;
    }
}
