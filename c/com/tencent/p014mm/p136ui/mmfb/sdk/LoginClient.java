package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient */
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new C116093a();

    /* renamed from: d */
    public LoginMethodHandler[] f348392d;

    /* renamed from: e */
    public int f348393e = -1;

    /* renamed from: f */
    public Activity f348394f;

    /* renamed from: g */
    public Request f348395g;

    /* renamed from: h */
    public Map<String, String> f348396h;

    /* renamed from: i */
    public Map<String, String> f348397i;

    /* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient$Result */
    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C116091a();

        /* renamed from: d */
        public final C116092b f348407d;

        /* renamed from: e */
        public final AccessToken f348408e;

        /* renamed from: f */
        public final String f348409f;

        /* renamed from: g */
        public final String f348410g;

        /* renamed from: h */
        public final Request f348411h;

        /* renamed from: i */
        public Map<String, String> f348412i;

        /* renamed from: j */
        public Map<String, String> f348413j;

        /* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient$Result$a */
        public class C116091a implements Parcelable.Creator<Result> {
            public Object createFromParcel(Parcel parcel) {
                return new Result(parcel, (C116093a) null);
            }

            public Object[] newArray(int i) {
                return new Result[i];
            }
        }

        /* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient$Result$b */
        public enum C116092b {
            ;

            /* access modifiers changed from: public */
            C116092b(String str) {
            }
        }

        public Result(Parcel parcel, C116093a aVar) {
            this.f348407d = C116092b.valueOf(parcel.readString());
            this.f348408e = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f348409f = parcel.readString();
            this.f348410g = parcel.readString();
            this.f348411h = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f348412i = CustomTabLoginMethodHandler.m163380b(parcel);
            this.f348413j = CustomTabLoginMethodHandler.m163380b(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f348407d.name());
            parcel.writeParcelable(this.f348408e, i);
            parcel.writeString(this.f348409f);
            parcel.writeString(this.f348410g);
            parcel.writeParcelable(this.f348411h, i);
            LoginMethodHandler.m163381a(parcel, this.f348412i);
            LoginMethodHandler.m163381a(parcel, this.f348413j);
        }
    }

    /* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient$a */
    public class C116093a implements Parcelable.Creator<LoginClient> {
        public Object createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        public Object[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    public LoginClient(Activity activity) {
        this.f348394f = activity;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f348392d, i);
        parcel.writeInt(this.f348393e);
        parcel.writeParcelable(this.f348395g, i);
        LoginMethodHandler.m163381a(parcel, this.f348396h);
        LoginMethodHandler.m163381a(parcel, this.f348397i);
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f348392d = new LoginMethodHandler[readParcelableArray.length];
        int i = 0;
        while (i < readParcelableArray.length) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f348392d;
            LoginMethodHandler loginMethodHandler = (LoginMethodHandler) readParcelableArray[i];
            loginMethodHandlerArr[i] = loginMethodHandler;
            if (loginMethodHandler.f348416e == null) {
                loginMethodHandler.f348416e = this;
                i++;
            } else {
                throw new RuntimeException("Can't set LoginClient if it is already set.");
            }
        }
        this.f348393e = parcel.readInt();
        this.f348395g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f348396h = CustomTabLoginMethodHandler.m163380b(parcel);
        this.f348397i = CustomTabLoginMethodHandler.m163380b(parcel);
    }

    /* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient$Request */
    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C116090a();

        /* renamed from: d */
        public final C57841n f348398d;

        /* renamed from: e */
        public Set<String> f348399e;

        /* renamed from: f */
        public final C116098d f348400f;

        /* renamed from: g */
        public final String f348401g;

        /* renamed from: h */
        public final String f348402h;

        /* renamed from: i */
        public boolean f348403i = false;

        /* renamed from: j */
        public String f348404j;

        /* renamed from: n */
        public String f348405n;

        /* renamed from: o */
        public String f348406o;

        /* renamed from: com.tencent.mm.ui.mmfb.sdk.LoginClient$Request$a */
        public class C116090a implements Parcelable.Creator<Request> {
            public Object createFromParcel(Parcel parcel) {
                return new Request(parcel, (C116093a) null);
            }

            public Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public Request(C57841n nVar, Set<String> set, C116098d dVar, String str, String str2, String str3) {
            this.f348398d = nVar;
            this.f348399e = set == null ? new HashSet<>() : set;
            this.f348400f = dVar;
            this.f348405n = str;
            this.f348401g = str2;
            this.f348402h = str3;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C57841n nVar = this.f348398d;
            String str = null;
            parcel.writeString(nVar != null ? nVar.name() : null);
            parcel.writeStringList(new ArrayList(this.f348399e));
            C116098d dVar = this.f348400f;
            if (dVar != null) {
                str = dVar.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.f348401g);
            parcel.writeString(this.f348402h);
            parcel.writeByte(this.f348403i ? (byte) 1 : 0);
            parcel.writeString(this.f348404j);
            parcel.writeString(this.f348405n);
            parcel.writeString(this.f348406o);
        }

        public Request(Parcel parcel, C116093a aVar) {
            boolean z = false;
            String readString = parcel.readString();
            C116098d dVar = null;
            this.f348398d = readString != null ? C57841n.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f348399e = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f348400f = readString2 != null ? C116098d.valueOf(readString2) : dVar;
            this.f348401g = parcel.readString();
            this.f348402h = parcel.readString();
            this.f348403i = parcel.readByte() != 0 ? true : z;
            this.f348404j = parcel.readString();
            this.f348405n = parcel.readString();
            this.f348406o = parcel.readString();
        }
    }
}
