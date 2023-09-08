package org.webrtc;

import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import org.webrtc.PeerConnection;

public class IceCandidate {
    public final PeerConnection.AdapterType adapterType;
    public final String sdp;
    public final int sdpMLineIndex;
    public final String sdpMid;
    public final String serverUrl;

    public IceCandidate(String str, int i, String str2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = "";
        this.adapterType = PeerConnection.AdapterType.UNKNOWN;
    }

    private static boolean objectEquals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IceCandidate)) {
            return false;
        }
        IceCandidate iceCandidate = (IceCandidate) obj;
        return objectEquals(this.sdpMid, iceCandidate.sdpMid) && this.sdpMLineIndex == iceCandidate.sdpMLineIndex && objectEquals(this.sdp, iceCandidate.sdp);
    }

    public String getSdp() {
        return this.sdp;
    }

    public String getSdpMid() {
        return this.sdpMid;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.sdpMid, Integer.valueOf(this.sdpMLineIndex), this.sdp});
    }

    public String toString() {
        return this.sdpMid + XVFSFile.PATH_SEPARATOR + this.sdpMLineIndex + XVFSFile.PATH_SEPARATOR + this.sdp + XVFSFile.PATH_SEPARATOR + this.serverUrl + XVFSFile.PATH_SEPARATOR + this.adapterType.toString();
    }

    public IceCandidate(String str, int i, String str2, String str3, PeerConnection.AdapterType adapterType2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = str3;
        this.adapterType = adapterType2;
    }
}
