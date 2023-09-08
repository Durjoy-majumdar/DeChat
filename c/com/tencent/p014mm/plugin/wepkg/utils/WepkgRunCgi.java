package com.tencent.p014mm.plugin.wepkg.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashSet;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import pe3.C47465a;
import u14.C52419b;

/* renamed from: com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi */
public final class WepkgRunCgi {

    /* renamed from: com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi$a */
    public class C44530a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C44531b f120768d;

        public C44530a(C44531b bVar) {
            this.f120768d = bVar;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C44531b bVar = this.f120768d;
            if (bVar == null) {
                return 0;
            }
            bVar.mo69306a(i, i2, str, cVar);
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi$b */
    public interface C44531b {
        /* renamed from: a */
        void mo69306a(int i, int i2, String str, C47350c cVar);
    }

    /* renamed from: a */
    public static void m48901a(C47350c cVar, Parcel parcel) {
        parcel.writeString(cVar.f127055a.f127080a.getClass().getName());
        byte[] bArr = new byte[0];
        try {
            bArr = cVar.f127055a.f127080a.toByteArray();
        } catch (Exception unused) {
        }
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeString(cVar.f127056b.f127083a.getClass().getName());
        byte[] bArr2 = new byte[0];
        try {
            bArr2 = cVar.f127056b.f127083a.toByteArray();
        } catch (Exception unused2) {
        }
        parcel.writeInt(bArr2.length);
        parcel.writeByteArray(bArr2);
        parcel.writeString(cVar.f127057c);
        parcel.writeInt(cVar.f127058d);
        parcel.writeInt(cVar.f127055a.f127082c);
        parcel.writeInt(cVar.f127056b.f127084b);
    }

    /* renamed from: b */
    public static C47350c m48902b(Parcel parcel) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        String readString = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            bVar.f127066a = ((C47465a) Class.forName(readString).newInstance()).parseFrom(bArr);
        } catch (Exception unused) {
        }
        String readString2 = parcel.readString();
        byte[] bArr2 = new byte[parcel.readInt()];
        parcel.readByteArray(bArr2);
        try {
            bVar.f127067b = ((C47465a) Class.forName(readString2).newInstance()).parseFrom(bArr2);
        } catch (Exception e) {
            if (e instanceof C52419b) {
                try {
                    bVar.f127067b = (C47465a) Class.forName(readString2).newInstance();
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.Wepkg.WepkgRunCgi", "readCommReqRespFromParcel, resp fields not ready, re-create one but exp = %s", Util.stackTraceToString(e2));
                }
            }
        }
        bVar.f127068c = parcel.readString();
        bVar.f127069d = parcel.readInt();
        bVar.f127070e = parcel.readInt();
        bVar.f127071f = parcel.readInt();
        return bVar.mo72403a();
    }

    /* renamed from: c */
    public static void m48903c(C47350c cVar, C44531b bVar) {
        if (MMApplicationContext.isMMProcess()) {
            C89144l0.m111429e(cVar, new C44530a(bVar), false);
            return;
        }
        RemoteCgiTask remoteCgiTask = new RemoteCgiTask();
        ((HashSet) C44536d.f120772c).add(remoteCgiTask);
        remoteCgiTask.f120766n = cVar;
        remoteCgiTask.f120767o = bVar;
        remoteCgiTask.f120761f = 1;
        remoteCgiTask.mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi$RemoteCgiTask */
    public static final class RemoteCgiTask extends MainProcessTask implements l0$$e {
        public static final Parcelable.Creator<RemoteCgiTask> CREATOR = new C44529a();

        /* renamed from: f */
        public int f120761f = 0;

        /* renamed from: g */
        public int f120762g;

        /* renamed from: h */
        public int f120763h;

        /* renamed from: i */
        public String f120764i;

        /* renamed from: j */
        public C47350c f120765j;

        /* renamed from: n */
        public C47350c f120766n;

        /* renamed from: o */
        public C44531b f120767o;

        /* renamed from: com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi$RemoteCgiTask$a */
        public class C44529a implements Parcelable.Creator<RemoteCgiTask> {
            public Object createFromParcel(Parcel parcel) {
                return new RemoteCgiTask(parcel);
            }

            public Object[] newArray(int i) {
                return new RemoteCgiTask[i];
            }
        }

        public RemoteCgiTask() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            this.f120762g = i;
            this.f120763h = i2;
            this.f120764i = str;
            this.f120765j = cVar;
            this.f120761f = 2;
            mo114394b();
            return 0;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            int readInt = parcel.readInt();
            this.f120761f = readInt;
            if (readInt == 1) {
                this.f120766n = WepkgRunCgi.m48902b(parcel);
            } else if (readInt == 2) {
                this.f120762g = parcel.readInt();
                this.f120763h = parcel.readInt();
                this.f120764i = parcel.readString();
                this.f120765j = WepkgRunCgi.m48902b(parcel);
            }
        }

        /* renamed from: i */
        public void mo1552i() {
            ((HashSet) C44536d.f120772c).remove(this);
            C44531b bVar = this.f120767o;
            if (bVar != null) {
                bVar.mo69306a(this.f120762g, this.f120763h, this.f120764i, this.f120765j);
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            C89144l0.m111429e(this.f120766n, this, true);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f120761f);
            int i2 = this.f120761f;
            if (i2 == 1) {
                WepkgRunCgi.m48901a(this.f120766n, parcel);
            } else if (i2 == 2) {
                parcel.writeInt(this.f120762g);
                parcel.writeInt(this.f120763h);
                parcel.writeString(this.f120764i);
                WepkgRunCgi.m48901a(this.f120765j, parcel);
            }
        }

        public RemoteCgiTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
