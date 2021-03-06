package com.wechat.backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * not an ignored comment
 */
@ApiModel(description = "not an ignored comment")
@Entity
@Table(name = "wechat_product")
public class WechatProduct extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 产品编码，业务字段
     */
    @NotNull
    @Size(max = 255)
    @ApiModelProperty(value = "产品编码，业务字段", required = true)
    @Column(name = "product_code", length = 255, nullable = false)
    private String productCode;

    /**
     * 产品编码，业务字段
     */
    @NotNull
    @Size(max = 255)
    @ApiModelProperty(value = "产品编码，业务字段", required = true)
    @Column(name = "product_name", length = 255, nullable = false)
    private String productName;

    /**
     * 产品构成描述
     */
    @Size(max = 1024)
    @ApiModelProperty(value = "产品构成描述")
    @Column(name = "meta_desc", length = 1024)
    private String metaDesc;

    /**
     * 产品图片
     */
    @Size(max = 1024)
    @ApiModelProperty(value = "产品图片")
    @Column(name = "image", length = 1024)
    private String image;

    /**
     * 原始价格
     */
    @ApiModelProperty(value = "原始价格")
    @Column(name = "original_price", precision=10, scale=2)
    private BigDecimal originalPrice;

    /**
     * 价格
     */
    @ApiModelProperty(value = "价格")
    @Column(name = "price", precision=10, scale=2)
    private BigDecimal price;

    /**
     * 数量
     */
    @ApiModelProperty(value = "数量")
    @Column(name = "product_quantity", precision=10, scale=2)
    private BigDecimal productQuantity;

    /**
     * 是否为平台商品
     */
    @ApiModelProperty(value = "是否为平台商品")
    @Column(name = "platform_product")
    private Boolean platformProduct;

    /**
     * 是否售罄
     */
    @ApiModelProperty(value = "是否售罄")
    @Column(name = "sell_out")
    private Boolean sellOut;

    /**
     * 是否上线
     */
    @ApiModelProperty(value = "是否上线")
    @Column(name = "go_live")
    private Boolean goLive;

    @Column(name = "collect_times")
    private Integer collectTimes;

    @ManyToOne
    private WechatUser wechatUser;

    @OneToMany(mappedBy = "wechatProduct")
    private Set<WechatProductImage> images = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public WechatProduct productCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public WechatProduct productName(String productName) {
        this.productName = productName;
        return this;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMetaDesc() {
        return metaDesc;
    }

    public WechatProduct metaDesc(String metaDesc) {
        this.metaDesc = metaDesc;
        return this;
    }

    public void setMetaDesc(String metaDesc) {
        this.metaDesc = metaDesc;
    }

    public String getImage() {
        return image;
    }

    public WechatProduct image(String image) {
        this.image = image;
        return this;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public WechatProduct originalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public WechatProduct price(BigDecimal price) {
        this.price = price;
        return this;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getProductQuantity() {
        return productQuantity;
    }

    public WechatProduct productQuantity(BigDecimal productQuantity) {
        this.productQuantity = productQuantity;
        return this;
    }

    public void setProductQuantity(BigDecimal productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Boolean isPlatformProduct() {
        return platformProduct;
    }

    public WechatProduct platformProduct(Boolean platformProduct) {
        this.platformProduct = platformProduct;
        return this;
    }

    public void setPlatformProduct(Boolean platformProduct) {
        this.platformProduct = platformProduct;
    }

    public Boolean isSellOut() {
        return sellOut;
    }

    public WechatProduct sellOut(Boolean sellOut) {
        this.sellOut = sellOut;
        return this;
    }

    public void setSellOut(Boolean sellOut) {
        this.sellOut = sellOut;
    }

    public Boolean isGoLive() {
        return goLive;
    }

    public WechatProduct goLive(Boolean goLive) {
        this.goLive = goLive;
        return this;
    }

    public void setGoLive(Boolean goLive) {
        this.goLive = goLive;
    }

    public Integer getCollectTimes() {
        return collectTimes;
    }

    public WechatProduct collectTimes(Integer collectTimes) {
        this.collectTimes = collectTimes;
        return this;
    }

    public void setCollectTimes(Integer collectTimes) {
        this.collectTimes = collectTimes;
    }

    public WechatUser getWechatUser() {
        return wechatUser;
    }

    public WechatProduct wechatUser(WechatUser wechatUser) {
        this.wechatUser = wechatUser;
        return this;
    }

    public void setWechatUser(WechatUser wechatUser) {
        this.wechatUser = wechatUser;
    }

    public Set<WechatProductImage> getImages() {
        return images;
    }

    public WechatProduct images(Set<WechatProductImage> wechatProductImages) {
        this.images = wechatProductImages;
        return this;
    }

    public WechatProduct addImages(WechatProductImage wechatProductImage) {
        this.images.add(wechatProductImage);
        wechatProductImage.setWechatProduct(this);
        return this;
    }

    public WechatProduct removeImages(WechatProductImage wechatProductImage) {
        this.images.remove(wechatProductImage);
        wechatProductImage.setWechatProduct(null);
        return this;
    }

    public void setImages(Set<WechatProductImage> wechatProductImages) {
        this.images = wechatProductImages;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WechatProduct wechatProduct = (WechatProduct) o;
        if (wechatProduct.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), wechatProduct.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "WechatProduct{" +
            "id=" + getId() +
            ", productCode='" + getProductCode() + "'" +
            ", productName='" + getProductName() + "'" +
            ", metaDesc='" + getMetaDesc() + "'" +
            ", image='" + getImage() + "'" +
            ", originalPrice=" + getOriginalPrice() +
            ", price=" + getPrice() +
            ", productQuantity=" + getProductQuantity() +
            ", platformProduct='" + isPlatformProduct() + "'" +
            ", sellOut='" + isSellOut() + "'" +
            ", goLive='" + isGoLive() + "'" +
            ", collectTimes=" + getCollectTimes() +
            "}";
    }
}
