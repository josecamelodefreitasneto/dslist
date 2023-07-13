package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;	
	private Integer year;
	private String imgUrl;
	private String longDescription;
	
	public GameMinDTO(){
		
		}

	public GameMinDTO(Game entity) {
		
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.longDescription = entity.getShortDescription();
	}
	
public GameMinDTO(GameMinProjection projection) {		
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getYear();
		this.imgUrl = projection.getImgUrl();
		this.longDescription = projection.getShortDescription();
		}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getLongDescription() {
		return longDescription;
	}
	
}
