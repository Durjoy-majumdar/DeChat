package zw1;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import di3.C7335d;

/* renamed from: zw1.b */
public interface C16408b extends C7335d {
    /* renamed from: GB */
    void mo14868GB(Context context, C16409a aVar);

    void Vc0(String str, String str2, String str3);

    void W70(Context context, C16409a aVar, Lbs lbs, ActivityOptions activityOptions, boolean z);

    /* renamed from: ZR */
    void mo14871ZR(String str, String str2);

    /* renamed from: aD */
    boolean mo14872aD(Context context, C16409a aVar);

    String z90(String str, String str2);

    /* renamed from: zw1.b$a */
    public static class C16409a {

        /* renamed from: a */
        public String f43817a;

        /* renamed from: b */
        public String f43818b;

        /* renamed from: c */
        public boolean f43819c;

        /* renamed from: d */
        public long f43820d;

        /* renamed from: e */
        public long f43821e;

        /* renamed from: f */
        public boolean f43822f;

        /* renamed from: g */
        public Bundle f43823g;

        /* renamed from: h */
        public int f43824h = -1;

        /* renamed from: i */
        public long f43825i = -1;

        /* renamed from: j */
        public int f43826j = 0;

        /* renamed from: k */
        public boolean f43827k;

        /* renamed from: l */
        public String f43828l;

        public C16409a(String str, String str2, long j, long j2) {
            this.f43817a = str;
            this.f43818b = str2;
            this.f43820d = j;
            this.f43821e = j2;
        }

        public C16409a(String str, String str2, long j, long j2, boolean z, Bundle bundle) {
            this.f43817a = str;
            this.f43818b = str2;
            this.f43820d = j;
            this.f43821e = j2;
            this.f43819c = z;
            this.f43823g = bundle;
        }
    }
}
