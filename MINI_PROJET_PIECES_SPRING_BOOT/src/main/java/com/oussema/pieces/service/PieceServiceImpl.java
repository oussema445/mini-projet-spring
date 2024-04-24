package com.oussema.pieces.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.oussema.pieces.entities.Nature;
import com.oussema.pieces.entities.Piece;
import com.oussema.pieces.repos.NatureRepository;
import com.oussema.pieces.repos.PieceRepository;

@Service
public class PieceServiceImpl implements PieceService{

	@Autowired
	PieceRepository pieceRepository;
	
	
	@Autowired
	NatureRepository natureRepository;
	
	@Override
	public Piece savePiece(Piece p) {
		return pieceRepository.save(p);
	}

	@Override
	public Piece updatePiece(Piece p) {
		return pieceRepository.save(p);
	}

	@Override
	public void deletePiece(Piece p) {
		pieceRepository.delete(p);
		
	}

	@Override
	public void deletePieceById(Long id) {
		pieceRepository.deleteById(id);
		
	}

	@Override
	public Piece getPiece(Long id) {
		return pieceRepository.findById(id).get();
	}

	@Override
	public List<Piece> getAllPieces() {
		
		return pieceRepository.findAll();
	}
	
	@Override
	public Page<Piece> getAllPiecesParPage(int page, int size) {
		
		return pieceRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Nature> getAllNatures() {
		return natureRepository.findAll();
	}

	
	

}
