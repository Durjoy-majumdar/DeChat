package sf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedList;
import pe3.C47465a;
import rx3.C13598b0;
import u14.C52418a;
import v14.C102122a;
import w14.C53072a;
import z14.C53733a;

/* renamed from: sf0.d */
public class C48372d<T extends C47465a> {

    /* renamed from: a */
    public final String f129496a = "MicroMsg.BaseProtoPage";

    /* renamed from: b */
    public String f129497b;

    /* renamed from: a */
    public final void mo73081a() {
        String str = this.f129497b;
        if (str == null) {
            C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            throw null;
        } else if (Util.isNullOrNil(str)) {
            String str2 = this.f129496a;
            StringBuilder sb = new StringBuilder();
            sb.append("file path [");
            String str3 = this.f129497b;
            if (str3 != null) {
                sb.append(str3);
                sb.append("] is invalid!");
                Log.m105920e(str2, sb.toString());
                return;
            }
            C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            throw null;
        } else {
            synchronized (this) {
                String str4 = this.f129497b;
                if (str4 != null) {
                    C86013q1.m106447h(str4);
                } else {
                    C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
            }
        }
    }

    /* renamed from: b */
    public final LinkedList<T> mo73082b() {
        String str = this.f129497b;
        if (str == null) {
            C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            throw null;
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e(this.f129496a, "file path [%s] is invalid!");
            return null;
        } else {
            synchronized (this) {
                String str2 = this.f129497b;
                if (str2 == null) {
                    C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                } else if (!C86013q1.m106450k(str2)) {
                    String str3 = this.f129496a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("file ");
                    String str4 = this.f129497b;
                    if (str4 != null) {
                        sb.append(str4);
                        sb.append(" is not exist!");
                        Log.m105924i(str3, sb.toString());
                        return null;
                    }
                    C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                } else {
                    try {
                        String str5 = this.f129497b;
                        if (str5 == null) {
                            C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                            throw null;
                        } else if (str5 != null) {
                            byte[] O = C86013q1.m106433O(str5, 0, (int) C86013q1.m106451l(str5));
                            C53072a aVar = new C53072a();
                            C102122a aVar2 = new C102122a(O, aVar);
                            LinkedList<byte[]> j = aVar2.mo141632j(aVar2.mo141623a());
                            LinkedList<T> linkedList = new LinkedList<>();
                            for (byte[] bArr : j) {
                                Type genericSuperclass = getClass().getGenericSuperclass();
                                C87412m.m108592e(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                                C87412m.m108592e(type, "null cannot be cast to non-null type java.lang.Class<*>");
                                Object newInstance = ((Class) type).newInstance();
                                C87412m.m108592e(newInstance, "null cannot be cast to non-null type T of com.tencent.mm.platformtools.BaseProtoPage.readFromFile$lambda-2$lambda-1");
                                C47465a aVar3 = (C47465a) newInstance;
                                C87412m.m108591d(bArr);
                                C102122a aVar4 = new C102122a(bArr, aVar);
                                for (boolean z = true; z; z = aVar3.populateBuilderWithField(aVar4, aVar3, C47465a.getNextFieldNumber(aVar4))) {
                                }
                                linkedList.add(aVar3);
                            }
                            String str6 = this.f129496a;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("read ");
                            sb4.append(linkedList.size());
                            sb4.append(" items (total size ");
                            sb4.append(O.length);
                            sb4.append(") from file ");
                            String str7 = this.f129497b;
                            if (str7 != null) {
                                sb4.append(str7);
                                Log.m105924i(str6, sb4.toString());
                                return linkedList;
                            }
                            C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                            throw null;
                        } else {
                            C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                            throw null;
                        }
                    } catch (Exception e) {
                        String str8 = this.f129496a;
                        Log.m105920e(str8, "parse proto from file occur error: " + e.getMessage());
                        return null;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo73083c(LinkedList<T> linkedList) {
        C87412m.m108594g(linkedList, "dataList");
        String str = this.f129497b;
        if (str == null) {
            C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            throw null;
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e(this.f129496a, "file path [%s] is invalid!");
        } else {
            synchronized (this) {
                String str2 = this.f129497b;
                if (str2 != null) {
                    C86009m1 m1Var = new C86009m1(str2);
                    if (!C86013q1.m106450k(m1Var.mo119973k())) {
                        C86013q1.m106461v(m1Var.mo119973k());
                    }
                    String str3 = this.f129497b;
                    if (str3 != null) {
                        if (!C86013q1.m106450k(str3)) {
                            String str4 = this.f129496a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("create new file ");
                            String str5 = this.f129497b;
                            if (str5 != null) {
                                sb.append(str5);
                                Log.m105924i(str4, sb.toString());
                                String str6 = this.f129497b;
                                if (str6 != null) {
                                    C86013q1.m106444e(str6);
                                } else {
                                    C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                                throw null;
                            }
                        }
                        try {
                            int g = C52418a.m58680g(1, 8, linkedList);
                            String str7 = this.f129496a;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("write ");
                            sb4.append(linkedList.size());
                            sb4.append(" items (total size ");
                            sb4.append(g);
                            sb4.append(") to file ");
                            String str8 = this.f129497b;
                            if (str8 != null) {
                                sb4.append(str8);
                                Log.m105924i(str7, sb4.toString());
                                byte[] bArr = new byte[g];
                                new C53733a(bArr).mo74320g(1, 8, linkedList);
                                String str9 = this.f129497b;
                                if (str9 != null) {
                                    C86013q1.m106438T(str9, bArr, 0, g);
                                } else {
                                    C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                                throw null;
                            }
                        } catch (IOException e) {
                            String str10 = this.f129496a;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("write to file ");
                            String str11 = this.f129497b;
                            if (str11 != null) {
                                sb5.append(str11);
                                sb5.append(" occur error: ");
                                sb5.append(e.getMessage());
                                Log.m105920e(str10, sb5.toString());
                                C13598b0 b0Var = C13598b0.f38549a;
                            } else {
                                C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                        throw null;
                    }
                } else {
                    C87412m.m108603p(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                    throw null;
                }
            }
        }
    }
}
