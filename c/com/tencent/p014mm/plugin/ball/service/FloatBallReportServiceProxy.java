package com.tencent.p014mm.plugin.ball.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import xv0.C38856d;

/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallReportServiceProxy */
public final class FloatBallReportServiceProxy implements C38856d {

    /* renamed from: a */
    public static final C13601g<FloatBallReportServiceProxy> f50146a = C36568h.m40986b(C13602i.SYNCHRONIZED, C18152a.f50150d);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ball/service/FloatBallReportServiceProxy$MarkExitPageTaskData;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-ball_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallReportServiceProxy$MarkExitPageTaskData */
    public static final class MarkExitPageTaskData implements Parcelable {
        public static final C18151a CREATOR = new C18151a((C8480h) null);

        /* renamed from: d */
        public int f50147d;

        /* renamed from: e */
        public boolean f50148e;

        /* renamed from: f */
        public boolean f50149f;

        /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallReportServiceProxy$MarkExitPageTaskData$a */
        public static final class C18151a implements Parcelable.Creator<MarkExitPageTaskData> {
            public C18151a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                boolean z = false;
                MarkExitPageTaskData markExitPageTaskData = new MarkExitPageTaskData(0, false, false);
                markExitPageTaskData.f50147d = parcel.readInt();
                markExitPageTaskData.f50148e = parcel.readByte() != 0;
                if (parcel.readByte() != 0) {
                    z = true;
                }
                markExitPageTaskData.f50149f = z;
                return markExitPageTaskData;
            }

            public Object[] newArray(int i) {
                return new MarkExitPageTaskData[i];
            }
        }

        public MarkExitPageTaskData(int i, boolean z, boolean z2) {
            this.f50147d = i;
            this.f50148e = z;
            this.f50149f = z2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeInt(this.f50147d);
            parcel.writeByte(this.f50148e ? (byte) 1 : 0);
            parcel.writeByte(this.f50149f ? (byte) 1 : 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallReportServiceProxy$a */
    public static final class C18152a extends C87413o implements C32224a<FloatBallReportServiceProxy> {

        /* renamed from: d */
        public static final C18152a f50150d = new C18152a();

        public C18152a() {
            super(0);
        }

        public Object invoke() {
            return new FloatBallReportServiceProxy();
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ball/service/FloatBallReportServiceProxy$b;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/ball/service/FloatBallReportServiceProxy$MarkExitPageTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-ball_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallReportServiceProxy$b */
    public static final class C18153b implements C80883e<MarkExitPageTaskData, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            MarkExitPageTaskData markExitPageTaskData = (MarkExitPageTaskData) obj;
            if (markExitPageTaskData != null) {
                C13601g<C18155b> gVar2 = C18155b.f50152c;
                C18155b.f50152c.getValue().mo22761a(markExitPageTaskData.f50147d, markExitPageTaskData.f50148e, markExitPageTaskData.f50149f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallReportServiceProxy$c */
    public static final class C18154c<T> implements C1256g {

        /* renamed from: d */
        public static final C18154c<T> f50151d = new C18154c<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
        }
    }

    /* renamed from: a */
    public void mo22761a(int i, boolean z, boolean z2) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new MarkExitPageTaskData(i, z, z2), C18153b.class, C18154c.f50151d);
    }

    /* renamed from: b */
    public void mo22762b(long j, int i) {
        C13601g<C18155b> gVar = C18155b.f50152c;
        C18155b.f50152c.getValue().mo22762b(j, i);
    }

    /* renamed from: f */
    public void mo22763f(boolean z) {
        C13601g<C18155b> gVar = C18155b.f50152c;
        C18155b.f50152c.getValue().mo22763f(z);
    }
}
