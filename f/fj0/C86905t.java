package fj0;

import android.net.http.AndroidHttpClient;
import android.text.TextUtils;
import cj0.C80039a;
import com.tencent.xweb.util.WXWebReporter;
import dj0.C86327d;
import dj0.C86328e;
import hj0.C87532b;
import hj0.C87535e;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

/* renamed from: fj0.t */
public class C86905t {

    /* renamed from: d */
    public static C86905t f252229d;

    /* renamed from: a */
    public MulticastSocket f252230a;

    /* renamed from: b */
    public InetAddress f252231b;

    /* renamed from: c */
    public int f252232c = -1;

    /* renamed from: fj0.t$a */
    public static class C86906a extends HttpPost {

        /* renamed from: d */
        public C86328e.C86329a f252233d;

        public C86906a(String str, C86328e.C86329a aVar) {
            super(str);
            this.f252233d = aVar;
        }

        public String getMethod() {
            return this.f252233d.name();
        }
    }

    public C86905t(boolean z) {
        try {
            this.f252231b = InetAddress.getByName("239.255.255.250");
            if (z) {
                MulticastSocket multicastSocket = new MulticastSocket();
                this.f252230a = multicastSocket;
                multicastSocket.setBroadcast(true);
                this.f252232c = this.f252230a.getLocalPort();
            }
        } catch (IOException e) {
            C80039a.m97318c("TransporterImpl", e, "");
        }
    }

    /* renamed from: a */
    public C87535e mo121353a(C86328e eVar) {
        AndroidHttpClient androidHttpClient = null;
        try {
            androidHttpClient = AndroidHttpClient.newInstance("");
            C86906a aVar = new C86906a(eVar.mo120722e(), eVar.mo120721d());
            Map<String, String> c = eVar.mo120720c();
            if (c != null) {
                HashMap hashMap = (HashMap) c;
                if (!hashMap.isEmpty()) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        aVar.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            String a = eVar.mo120718a();
            if (!TextUtils.isEmpty(a)) {
                StringEntity stringEntity = new StringEntity(a, "utf-8");
                stringEntity.setContentType("text/xml; charset=\"utf-8\"");
                aVar.setEntity(stringEntity);
            }
            HttpResponse execute = androidHttpClient.execute(aVar);
            androidHttpClient.close();
            C87535e eVar2 = new C87535e(false);
            eVar2.f253593a = new C87532b();
            for (Header header : execute.getAllHeaders()) {
                eVar2.f253593a.mo122002b(header.getName(), header.getValue());
            }
            eVar2.f253594b = C86907u.m107925a().mo121357b(EntityUtils.toString(execute.getEntity(), "utf-8").replaceAll("&(?!amp;)", "&amp;"));
            eVar2.f253592c = execute.getStatusLine().getStatusCode();
            return eVar2;
        } catch (IOException e) {
            if (androidHttpClient != null) {
                androidHttpClient.close();
            }
            C80039a.m97316a("TransporterImpl", e.toString());
            throw e;
        }
    }

    /* renamed from: b */
    public void mo121354b(C86327d dVar) {
        if (this == f252229d) {
            byte[] bytes = dVar.mo120718a().getBytes();
            this.f252230a.send(new DatagramPacket(bytes, bytes.length, this.f252231b, WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID));
            return;
        }
        if (this.f252230a == null) {
            MulticastSocket multicastSocket = new MulticastSocket();
            this.f252230a = multicastSocket;
            multicastSocket.setBroadcast(true);
            this.f252232c = this.f252230a.getLocalPort();
        }
        byte[] bytes2 = dVar.mo120718a().getBytes();
        this.f252230a.send(new DatagramPacket(bytes2, bytes2.length, this.f252231b, WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID));
        this.f252230a.close();
    }

    public void finalize() {
        if (this == f252229d) {
            this.f252230a.close();
        }
        super.finalize();
    }
}
