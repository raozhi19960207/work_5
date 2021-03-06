package com.ourcause.everest.model;

import java.io.Serializable;

/**
 * Created by infonous on 16-9-3.
 */
public class TravelCameraImageInfo implements Serializable {

    private static final long serialVersionUID = -7060210544600424445L;

    private Integer travelNotesPtr;

    private String fileName;    //文件名称
    private String path;        //文件路径
    private String uri;        //URI 资源路径

    private Integer translatedLength;   //原图缩放保存之后的图片宽
    private Integer translatedWidth;    //原图缩放保存之后的图片宽

    private String createDateTime;  //图片拍摄时间
    private Integer length;          //图片像素：长宽
    private Integer width;           //图片像素：长宽
    private String make;            //制造商
    private String model;           //相机型号
    private Double focalLength;     //焦距

    private Double realWidth;    //真实的物体宽宽
    private Double realHeight;   //真实的物体高度

    private Double measureWidth;    //测量之目标宽
    private Double measureHeight;   //测量之目标高
    private Double magnification;   //在拍摄图片时， 用户可能作放大操作，默认为 1 倍，也就是不变

    public Integer getTravelNotesPtr() {
        return travelNotesPtr;
    }

    public void setTravelNotesPtr(Integer travelNotesPtr) {
        this.travelNotesPtr = travelNotesPtr;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Integer getTranslatedLength() {
        return translatedLength;
    }

    public void setTranslatedLength(Integer translatedLength) {
        this.translatedLength = translatedLength;
    }

    public Integer getTranslatedWidth() {
        return translatedWidth;
    }

    public void setTranslatedWidth(Integer translatedWidth) {
        this.translatedWidth = translatedWidth;
    }

    public String getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(Double focalLength) {
        this.focalLength = focalLength;
    }

    public Double getRealWidth() {
        return realWidth;
    }

    public void setRealWidth(Double realWidth) {
        this.realWidth = realWidth;
    }

    public Double getRealHeight() {
        return realHeight;
    }

    public void setRealHeight(Double realHeight) {
        this.realHeight = realHeight;
    }

    public Double getMeasureWidth() {
        return measureWidth;
    }

    public void setMeasureWidth(Double measureWidth) {
        this.measureWidth = measureWidth;
    }

    public Double getMeasureHeight() {
        return measureHeight;
    }

    public void setMeasureHeight(Double measureHeight) {
        this.measureHeight = measureHeight;
    }

    public Double getMagnification() {
        return magnification;
    }

    public void setMagnification(Double magnification) {
        this.magnification = magnification;
    }
}
