

package com.hdroid.http.multipart.content;


import java.io.IOException;
import java.io.OutputStream;

import com.hdroid.http.multipart.MultipartEntity;


/**
 * @since 4.0
 */
public interface ContentBody extends ContentDescriptor {

    String getFilename();

    void writeTo(OutputStream out) throws IOException;

    void setCallBackInfo(MultipartEntity.CallBackInfo callBackInfo);

}
