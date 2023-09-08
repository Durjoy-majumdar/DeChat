package c12;

import com.tencent.ilink.NetworkManager;
import com.tencent.ilink.network.Proto;
import com.tencent.p014mm.app.C80625v0;
import d12.C24446b;
import d12.C7159a;
import di3.C86301e;
import e12.C31407b;
import e12.C31408c;
import e12.C31409d;
import ei3.C86522b;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p144dt.C7516d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: c12.c */
public final class C16832c extends C86301e implements C7516d {

    /* renamed from: d */
    public final ConcurrentHashMap<Integer, String> f45473d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public final ConcurrentHashMap<Integer, C31407b> f45474e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public NetworkManager f45475f;

    /* renamed from: c12.c$a */
    public static final class C16833a implements NetworkManager.Callback {

        /* renamed from: a */
        public final /* synthetic */ C16832c f45476a;

        public C16833a(C16832c cVar, C7516d.C7517a aVar) {
            this.f45476a = cVar;
        }

        public void onAppSessionTimeoutEvent() {
        }

        public void onC2CDownloadComplete(int i, Proto.IlinkC2CDownloadResult ilinkC2CDownloadResult) {
            C31407b bVar = this.f45476a.f45474e.get(Integer.valueOf(i));
            this.f45476a.f45474e.remove(Integer.valueOf(i));
            if (ilinkC2CDownloadResult != null && ilinkC2CDownloadResult.getErrorCode() == 0) {
                C13601g gVar = C31409d.f84075a;
                ((C31408c) ((C36570n) C31409d.f84075a).getValue()).mo58155Lo(bVar);
            }
        }

        public void onC2CDownloadProgress(int i, long j, long j2) {
        }

        public void onC2CUploadComplete(int i, Proto.IlinkC2CUploadResult ilinkC2CUploadResult) {
        }

        public void onC2CUploadProgress(int i, long j, long j2) {
        }

        public void onReceiveAppMessageEvent(Proto.IlinkBypassMsgList ilinkBypassMsgList) {
        }

        public void onReceiveNotifyEvent(int i, byte[] bArr) {
        }

        public void onReceiveSyncMessageEvent(int i, byte[] bArr) {
        }

        public void onRequestCheckResourceComplete(int i, int i2, byte[] bArr) {
            String str = this.f45476a.f45473d.get(Integer.valueOf(i));
            this.f45476a.f45473d.remove(Integer.valueOf(i));
            if (i2 == 0) {
                List<C24446b.C24456d> list = C24446b.C24459e.f69964g.parseFrom(bArr).f69965d;
                if (list.size() != 0) {
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C24446b.C24456d dVar = list.get(i3);
                        Proto.IlinkC2CDownload.Builder newBuilder = Proto.IlinkC2CDownload.newBuilder();
                        newBuilder.setTaskIdent(dVar.mo51139a() + '_' + dVar.mo51140b() + '_' + dVar.f69949g);
                        C7159a aVar = C7159a.f25134a;
                        String a = dVar.mo51139a();
                        C87412m.m108593f(a, "it.projectId");
                        String b = dVar.mo51140b();
                        C87412m.m108593f(b, "it.resourceName");
                        newBuilder.setFilePath(aVar.mo8346a(a, b, dVar.f69949g));
                        newBuilder.setFileSize((long) dVar.f69950h);
                        newBuilder.setFileUrl(dVar.getUrl());
                        NetworkManager networkManager = this.f45476a.f45475f;
                        C87412m.m108591d(networkManager);
                        int genTaskId = networkManager.genTaskId();
                        NetworkManager networkManager2 = this.f45476a.f45475f;
                        C87412m.m108591d(networkManager2);
                        networkManager2.c2CDownloadAsync(genTaskId, (Proto.IlinkC2CDownload) newBuilder.build());
                        C31407b bVar = new C31407b();
                        bVar.field_projectId = dVar.mo51139a();
                        bVar.field_resourceName = dVar.mo51140b();
                        bVar.field_resourceVersion = dVar.f69949g;
                        bVar.field_resourceSize = dVar.f69950h;
                        bVar.field_url = dVar.getUrl();
                        bVar.field_md5 = dVar.getMd5();
                        bVar.field_createTime = (long) dVar.f69953n;
                        this.f45476a.f45474e.put(Integer.valueOf(genTaskId), bVar);
                    }
                }
            }
        }

        public void onRequestUploadLogEvent(byte[] bArr) {
        }

        public void onSendRequestComplete(int i, int i2, byte[] bArr) {
        }

        public void onUpdatePushTokenComplete(int i, int i2, byte[] bArr, int i3) {
        }
    }

    /* renamed from: Za */
    public void mo8638Za() {
        C16834e eVar = C16834e.f45477a;
        synchronized (C16834e.f45479c) {
            if (!C16834e.f45478b) {
                eVar.mo17885a();
                C16834e.f45478b = true;
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0223 A[LOOP:1: B:52:0x0223->B:53:0x0232, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0283 A[LOOP:3: B:62:0x027d->B:64:0x0283, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02e9  */
    /* renamed from: v8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8639v8(java.lang.String r12, java.lang.String r13, p144dt.C7516d.C7517a r14) {
        /*
            r11 = this;
            java.lang.String r0 = "projectId"
            gy3.C87412m.m108594g(r12, r0)
            r11.mo8638Za()
            com.tencent.ilink.NetworkManager r0 = r11.f45475f
            if (r0 != 0) goto L_0x0024
            com.tencent.ilink.Context r0 = com.tencent.ilink.Context.getInstance()
            com.tencent.ilink.CloudSession r0 = r0.getCloudSession()
            com.tencent.ilink.NetworkManager r0 = r0.newNetworkManager()
            r11.f45475f = r0
            if (r0 == 0) goto L_0x0024
            c12.c$a r1 = new c12.c$a
            r1.<init>(r11, r14)
            r0.setCallback(r1)
        L_0x0024:
            d12.b$a r0 = d12.C24446b.C24447a.f69910j
            d12.b$a$b r0 = r0.toBuilder()
            int r1 = r0.f69918d
            r2 = 1
            r1 = r1 | r2
            r0.f69918d = r1
            r0.f69919e = r12
            r0.onChanged()
            r1 = 2
            if (r13 == 0) goto L_0x0042
            int r3 = r0.f69918d
            r3 = r3 | r1
            r0.f69918d = r3
            r0.f69920f = r13
            r0.onChanged()
        L_0x0042:
            d12.b$c$b r13 = r0.mo51112a()
            java.lang.String r3 = "package_type"
            r13.mo51137h(r3)
            d12.b$f$b r3 = r13.mo51133d()
            java.lang.String r4 = "wechat_android"
            r3.mo51164g(r4)
            r13.mo51138j(r3)
            d12.b$c$b r13 = r0.mo51112a()
            java.lang.String r3 = "uin"
            r13.mo51137h(r3)
            d12.b$f$b r3 = r13.mo51133d()
            f40.e r4 = f40.C86709a0.m107523b()
            java.lang.String r4 = r4.mo121111i()
            java.lang.String r5 = "account().uinString"
            gy3.C87412m.m108593f(r4, r5)
            long r4 = java.lang.Long.parseLong(r4)
            int r6 = r3.f69978d
            r6 = r6 | 8
            r3.f69978d = r6
            r3.f69982h = r4
            r3.onChanged()
            r13.mo51138j(r3)
            d12.b$c$b r13 = r0.mo51112a()
            java.lang.String r3 = "client_version"
            r13.mo51137h(r3)
            d12.b$f$b r3 = r13.mo51133d()
            int r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
            long r4 = (long) r4
            int r6 = r3.f69978d
            r6 = r6 | 8
            r3.f69978d = r6
            r3.f69982h = r4
            r3.onChanged()
            r13.mo51138j(r3)
            d12.b$c$b r13 = r0.mo51112a()
            java.lang.String r3 = "os_version"
            r13.mo51137h(r3)
            d12.b$f$b r3 = r13.mo51133d()
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.mo51164g(r4)
            r13.mo51138j(r3)
            d12.b$c$b r13 = r0.mo51112a()
            java.lang.String r3 = "device_model"
            r13.mo51137h(r3)
            d12.b$f$b r3 = r13.mo51133d()
            java.lang.String r4 = qe3.C89625d.f257837c
            r3.mo51164g(r4)
            r13.mo51138j(r3)
            d12.b$c$b r13 = r0.mo51112a()
            java.lang.String r3 = "network_type"
            r13.mo51137h(r3)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getFormatedNetType(r3)
            r4 = 0
            if (r3 == 0) goto L_0x0127
            int r5 = r3.hashCode()
            r6 = 1621(0x655, float:2.272E-42)
            if (r5 == r6) goto L_0x011c
            r6 = 1652(0x674, float:2.315E-42)
            if (r5 == r6) goto L_0x0111
            r6 = 1683(0x693, float:2.358E-42)
            if (r5 == r6) goto L_0x0106
            r6 = 2664213(0x28a715, float:3.733358E-39)
            if (r5 == r6) goto L_0x00fb
            goto L_0x0127
        L_0x00fb:
            java.lang.String r5 = "WIFI"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0104
            goto L_0x0127
        L_0x0104:
            r3 = 4
            goto L_0x0128
        L_0x0106:
            java.lang.String r5 = "4G"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x010f
            goto L_0x0127
        L_0x010f:
            r3 = 3
            goto L_0x0128
        L_0x0111:
            java.lang.String r5 = "3G"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x011a
            goto L_0x0127
        L_0x011a:
            r3 = 2
            goto L_0x0128
        L_0x011c:
            java.lang.String r5 = "2G"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0125
            goto L_0x0127
        L_0x0125:
            r3 = 1
            goto L_0x0128
        L_0x0127:
            r3 = 0
        L_0x0128:
            d12.b$f$b r5 = r13.mo51133d()
            long r6 = (long) r3
            int r3 = r5.f69978d
            r3 = r3 | 8
            r5.f69978d = r3
            r5.f69982h = r6
            r5.onChanged()
            r13.mo51138j(r5)
            if (r14 == 0) goto L_0x0142
            java.util.Map r13 = r14.mo8642c()
            goto L_0x0143
        L_0x0142:
            r13 = 0
        L_0x0143:
            if (r13 == 0) goto L_0x01f3
            java.util.Set r13 = r13.entrySet()
            if (r13 == 0) goto L_0x01f3
            java.util.Iterator r13 = r13.iterator()
        L_0x014f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01f3
            java.lang.Object r14 = r13.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r3 = r14.getValue()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x0186
            d12.b$c$b r3 = r0.mo51112a()
            java.lang.Object r5 = r14.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r3.mo51137h(r5)
            d12.b$f$b r5 = r3.mo51133d()
            java.lang.Object r14 = r14.getValue()
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r14, r6)
            java.lang.String r14 = (java.lang.String) r14
            r5.mo51164g(r14)
            r3.mo51138j(r5)
            goto L_0x014f
        L_0x0186:
            java.lang.Object r3 = r14.getValue()
            boolean r3 = r3 instanceof java.lang.Double
            if (r3 == 0) goto L_0x01bc
            d12.b$c$b r3 = r0.mo51112a()
            java.lang.Object r5 = r14.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r3.mo51137h(r5)
            d12.b$f$b r5 = r3.mo51133d()
            java.lang.Object r14 = r14.getValue()
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Double"
            gy3.C87412m.m108592e(r14, r6)
            java.lang.Double r14 = (java.lang.Double) r14
            double r6 = r14.doubleValue()
            int r14 = r5.f69978d
            r14 = r14 | r1
            r5.f69978d = r14
            r5.f69980f = r6
            r5.onChanged()
            r3.mo51138j(r5)
            goto L_0x014f
        L_0x01bc:
            java.lang.Object r3 = r14.getValue()
            boolean r3 = r3 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x014f
            d12.b$c$b r3 = r0.mo51112a()
            java.lang.Object r5 = r14.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r3.mo51137h(r5)
            d12.b$f$b r5 = r3.mo51133d()
            java.lang.Object r14 = r14.getValue()
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Long"
            gy3.C87412m.m108592e(r14, r6)
            java.lang.Long r14 = (java.lang.Long) r14
            long r6 = r14.longValue()
            int r14 = r5.f69978d
            r14 = r14 | r2
            r5.f69978d = r14
            r5.f69979e = r6
            r5.onChanged()
            r3.mo51138j(r5)
            goto L_0x014f
        L_0x01f3:
            rx3.g r13 = e12.C31409d.f84075a
            rx3.g r13 = e12.C31409d.f84075a
            rx3.n r13 = (rx3.C36570n) r13
            java.lang.Object r13 = r13.getValue()
            e12.c r13 = (e12.C31408c) r13
            r13.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r13.f84074d
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r12)
            r5[r4] = r6
            java.lang.String r4 = "select rowid, * from ILinkResourceInfo where projectId = ? "
            android.database.Cursor r3 = r3.rawQuery(r4, r5)
            java.lang.String r4 = "db.rawQuery(sql, arrayOf…capeSqlValue(projectId)))"
            gy3.C87412m.m108593f(r3, r4)
            boolean r4 = r3.moveToFirst()
            if (r4 == 0) goto L_0x0234
        L_0x0223:
            e12.b r4 = new e12.b
            r4.<init>()
            r4.convertFrom(r3)
            r14.add(r4)
            boolean r4 = r3.moveToNext()
            if (r4 != 0) goto L_0x0223
        L_0x0234:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x023d:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0279
            java.lang.Object r4 = r14.next()
            e12.b r4 = (e12.C31407b) r4
            d12.a r5 = d12.C7159a.f25134a
            java.lang.String r6 = r4.field_projectId
            java.lang.String r7 = "it.field_projectId"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.String r8 = r4.field_resourceName
            java.lang.String r9 = "it.field_resourceName"
            gy3.C87412m.m108593f(r8, r9)
            int r10 = r4.field_resourceVersion
            java.lang.String r5 = r5.mo8346a(r6, r8, r10)
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r5 != 0) goto L_0x0275
            java.lang.String r5 = r4.field_projectId
            gy3.C87412m.m108593f(r5, r7)
            java.lang.String r6 = r4.field_resourceName
            gy3.C87412m.m108593f(r6, r9)
            int r4 = r4.field_resourceVersion
            r13.mo58156jo(r5, r6, r4)
            goto L_0x023d
        L_0x0275:
            r3.add(r4)
            goto L_0x023d
        L_0x0279:
            java.util.Iterator r13 = r3.iterator()
        L_0x027d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x02b4
            java.lang.Object r14 = r13.next()
            e12.b r14 = (e12.C31407b) r14
            com.google.protobuf.e2 r3 = r0.mo51116e()
            d12.b$b r4 = d12.C24446b.C24450b.f69925h
            com.google.protobuf.a$a r3 = r3.mo37580d(r4)
            d12.b$b$b r3 = (d12.C24446b.C24450b.C24452b) r3
            java.lang.String r4 = r14.field_resourceName
            r3.getClass()
            r4.getClass()
            int r5 = r3.f69931d
            r5 = r5 | r2
            r3.f69931d = r5
            r3.f69932e = r4
            r3.onChanged()
            int r14 = r14.field_resourceVersion
            int r4 = r3.f69931d
            r4 = r4 | r1
            r3.f69931d = r4
            r3.f69933f = r14
            r3.onChanged()
            goto L_0x027d
        L_0x02b4:
            d12.b$a r13 = r0.buildPartial()
            boolean r14 = r13.isInitialized()
            if (r14 == 0) goto L_0x02e9
            com.tencent.ilink.network.Proto$ResourceRequestInfo$Builder r14 = com.tencent.ilink.network.Proto.ResourceRequestInfo.newBuilder()
            com.google.protobuf.k r13 = r13.toByteString()
            r14.setAppReq(r13)
            com.google.protobuf.l0 r13 = r14.build()
            com.tencent.ilink.network.Proto$ResourceRequestInfo r13 = (com.tencent.ilink.network.Proto.ResourceRequestInfo) r13
            com.tencent.ilink.NetworkManager r14 = r11.f45475f
            gy3.C87412m.m108591d(r14)
            int r14 = r14.genTaskId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r1 = r11.f45473d
            r1.put(r0, r12)
            com.tencent.ilink.NetworkManager r12 = r11.f45475f
            if (r12 == 0) goto L_0x02e8
            r12.requestCheckResourceAsync(r14, r13)
        L_0x02e8:
            return
        L_0x02e9:
            com.google.protobuf.q2 r12 = com.google.protobuf.C23803a.C23804a.newUninitializedMessageException(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c12.C16832c.mo8639v8(java.lang.String, java.lang.String, dt.d$a):void");
    }
}
